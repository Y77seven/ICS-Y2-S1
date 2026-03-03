/*
 * Lab Challenge Week 9
 * Add the AlarmClock, CuckooClock and HalloweenClock class files from past exercises into your project
 */
public class HouseOfClocks {

    // A house of clocks stores all its clocks in an array of Clock objects
    private Clock[] clocksCollection;
    // the number of clocks
    private int numClocks;


    // Lab Challenge #9.1
    // Creates a house of clocks which has a collection of numClocks clocks.
    // numClocks must be between 1 and 24, inclusive,
    //     and throws IllegalArgumentException otherwise.
    // The first clock must start at 00:00, the second clock at 01:00, and so on.
    // For example,
    //     if numClocks = 3, it stores 3 clocks starting at 00:00, 01:00, and 02:00.
    //     if numClocks = 24, it stores 24 clocks where the last one at index 23 starts at 23:00.
    public HouseOfClocks(int numClocks) {
        if (numClocks < 1) {
            throw new IllegalArgumentException("Number of clocks cannot be negative!");
        }
        else if (numClocks > 24) {
            throw new IllegalArgumentException("Too much clocks to store!");
        }

        this.numClocks = numClocks;
        this.clocksCollection = new Clock[numClocks];

        for (int i = 0; i < numClocks; i++) {
            clocksCollection[i] = new Clock(i,0);
       }
    }

    // Lab Challenge #9.2
    // creates a house of clocks which has a collection of four types of clocks in Week 9:
    // nClock, nAlarm, nCuckoo, nHalloween number of Clock, AlarmClock, CuckooClock, and HalloweenClock objects, respectively
    // all number of clock of any types must be between 0 and 24, inclusive;
    // and the total number of clocks must be between 1 and 24, inclusive; 
    // and throws IllegalArgumentException, otherwise
    // the first clock must start at 00:00, the second clock at 01:00, and so on
    // the alarm time of the AlarmClock objects must be 1 hour after the starting time
    // for example,
    // if nClock = 1, nAlarm = 1, nCuckoo = 1, nHalloween = 1,
    // it stores total of 4 clocks where the first clock at index 0 is a Clock object starts at 00:00,
    // the second clock at index 1 is an AlarmClock object starts at 01:00
    // the third clock at index 2 is a CuckooClock object starts at 02:00
    // and the fourth clock at index 3 is a HalloweenClock object starts at 03:00

    public HouseOfClocks(int nClock, int nAlarm, int nCuckoo, int nHalloween) {
        if (nClock   < 0 || nClock   > 24 || nAlarm   < 0 || nAlarm   > 24 || nCuckoo  < 0 || nCuckoo  > 24 || nHalloween < 0 || nHalloween > 24) {
            throw new IllegalArgumentException("No negative arguments!");
        }

        int total =  nClock + nAlarm + nCuckoo + nHalloween;

        if (total < 1 || total > 24) {
            throw new IllegalArgumentException("Too much clocks to store!");
        }

        this.numClocks = total;
        this.clocksCollection = new Clock[total];

        int index = 0;
        int hour = 0;

        // Clock
        for (int i = 0; i < nClock; i++) {
            clocksCollection[index++] = new Clock(hour,0);
            hour++;
        }

        // AlarmClock
        for (int i = 0; i < nAlarm; i++) {
            int startHour = hour;
            int alarmHour = (startHour + 1) % 24;
            clocksCollection[index++] = new AlarmClock(startHour, 0, alarmHour, 0);
            hour++;
        }

        // CuckooClock
        for (int i = 0; i < nCuckoo; i++) {
            clocksCollection[index++] = new CuckooClock(hour, 0);
            hour++;
        }

        // HalloweenClock
        for (int i = 0; i < nHalloween; i++) {
            clocksCollection[index++] = new HalloweenClock(hour, 0);
            hour++;
        }

    }


    // Lab Challenge #9.3
    // Calls the tick method of the clock in the collection at index clockIndex.
    // Throw an IndexOutOfBoundsException if the clockIndex is not valid,
    //     and use the message "No clock stored at index " followed by the invalid index. 
    public void tick(int clockIndex) {
        if (clockIndex < 0 || clockIndex >= numClocks) {
            throw new IndexOutOfBoundsException("No clock stored at index " + clockIndex);
        }
        clocksCollection[clockIndex].tick();
    }


    // Prints the time of all the clocks in the collection
    // Do NOT modify this method
    public void printClocks() {
        for (int i = 0; i < numClocks; i++) {
            System.out.println(clocksCollection[i]);
        }
    }


    // Test Client
    public static void main(String[] args) {

        // Test Case First Constructor #1
        HouseOfClocks hc1 = new HouseOfClocks(3);
        hc1.printClocks();                       // 00:00↵01:00↵02:00

        // Test Case First Constructor #2
        try {
            HouseOfClocks hc2 = new HouseOfClocks(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Too much clocks to store!");
        }

        // Test Case Tick #1
        hc1.tick(0);
        hc1.tick(0);
        hc1.tick(1);
        hc1.printClocks();                       // 00:02↵01:01↵02:00

        // Test Case Tick #2
        try {
            hc1.tick(100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());  // No clock stored at index 100
        }

        // Test Case Second Constructor and Polymorphic Tick
        HouseOfClocks hc3 = new HouseOfClocks(1, 1, 1, 1);
        hc3.printClocks();              // 00:00↵01:00↵02:00↵03:00

        for (int i = 0; i < 60; i++) {
            hc3.tick(1);                // Beep beep beep beep!
        }
        for (int i = 0; i < 60; i++) {
            hc3.tick(2);                // Cuckoo!↵Cuckoo!↵Cuckoo!
        }
        for (int i = 0; i < 3; i++) {
            hc3.tick(3);                // Halloween!
        }
        try {
            HouseOfClocks hc4 = new HouseOfClocks(1, 1, 1, -1);
        }
        catch (IllegalArgumentException e) {
            System.out.println("No negative arguments!");
        }
    }

}