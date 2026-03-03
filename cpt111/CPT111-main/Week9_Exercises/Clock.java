/*
 * Lab Exercise Week 9
 * Add the AlarmClock, CuckooClock and HalloweenClock class files from past exercises into your project
 */
public class Clock {
    private int hours;
    private int minutes;


    // Lab Exercise #9.1
    // Creates a clock whose initial time is h hours and m minutes.
    // Throws an IllegalArgumentException if either hours is not between 0 and 23,
    //     or minutes not between 0 and 59
    public Clock(int h, int m) {
        if (h < 0 || h > 23 || m < 0 || m > 59) {
            throw new IllegalArgumentException();
        }
        this.hours = h;
        this.minutes = m;
    }


    // Lab Exercise #9.2
    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    // Throws an IllegalArgumentException if either the string argument is not in this format,
    //     or if it does not correspond to a valid time between 00:00 and 23:59.
    public Clock(String s) {

        if (s == null || s.length() != 5) {
            throw new IllegalArgumentException();
        }

        if (s.charAt(2) != ':') {
            throw new IllegalArgumentException();
        }

        String[] split = s.split(":");

        if (split.length != 2) {
            throw new IllegalArgumentException();
        }

        int h = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);
        if (h < 0 || h > 23 || m < 0 || m > 59) {
            throw new IllegalArgumentException();
        }
        this.hours = Integer.parseInt(split[0]);
        this.minutes = Integer.parseInt(split[1]);
    }


    // Lab Exercise #9.3
    // Adds delta minutes to the time on this clock.
    // Throws an IllegalArgumentException if delta is negative,
    //     and use the message "Illegal negative delta " followed by the negative number.
    public void tock(int delta) {
        if (delta < 0) {
            throw new IllegalArgumentException("Illegal negative delta " + delta);
        }
        int totalMinutes = hours * 60 + minutes + delta;
        totalMinutes %= (24 * 60);
        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;

    }

    // Lab Exercises #9.4 Polymorphic Tick Function
    // Takes a Clock object and calls the tick method on it
    public static void tick(Clock clock) {
        clock.tick();
    }




    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        String output = "";
        if (hours < 10)
            output = output + "0";
        output = output + hours + ":";
        if (minutes < 10)
            output = output + "0";
        output = output + minutes;
        return output;
    }


    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if (hours < that.hours) {
            return true;
        } else if (hours > that.hours) {
            return false;
        } else return minutes < that.minutes;
    }


    // Adds 1 minute to the time on this clock.
    public void tick() {
        minutes++;
        if (minutes == 60) {
            hours++;
            minutes = 0;
            if (hours == 24)
                hours = 0;
        }
    }


    // Getters added
    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }


    // Test client
    public static void main(String[] args) {

        // Testing Lab Exercise #9.1
        Clock clock1 = new Clock(1, 0);
        System.out.println(clock1);

        try {
            Clock clock2 = new Clock(50, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument in constructor 1!");
        }

        // Testing Lab Exercise #9.2
        Clock clock3 = new Clock("02:30");
        System.out.println(clock3);

        try {
            Clock clock4 = new Clock("50:00");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument in constructor 2!");
        }

        // Testing Lab Exercise #9.3
        Clock clock5 = new Clock("02:30");
        clock5.tock(100);
        System.out.println(clock5);

        try {
            clock5.tock(-50);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Testing Lab Exercise #9.4
        AlarmClock clock6 = new AlarmClock(5, 59, 6, 0);
        Clock.tick(clock6);  // Beep beep beep beep!

        Clock clock = new Clock("02:30");
        Clock.tick(clock);  //02:31
        System.out.println(clock);

        HalloweenClock hc = new HalloweenClock(1, 0);
        Clock.tick(hc);
        Clock.tick(hc);
        Clock.tick(hc);  //Halloween!

    }
}
