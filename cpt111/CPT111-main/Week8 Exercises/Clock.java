/*
 * Exercise of Week #6, to be used again in Week #8
 * Complete using your codes in Week #6 or the standard solutions
 *
 */

public class Clock {
    private int hours;
    private int minutes;

    // Exercise #6.1
    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m) {
        this.hours = h;
        this.minutes = m;
    }

    // Exercise #6.2
    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {
        String[] split = s.split(":");
        this.hours = Integer.parseInt(split[0]);
        this.minutes = Integer.parseInt(split[1]);
    }

    // Exercise #6.3
    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        return String.format("%02d:%02d", this.hours, this.minutes);
    }

    // Exercise #6.4
    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if (this.hours < that.hours) {
            return true;
        }
        else
            return false;
    }

    // Exercise #6.5
    // Adds 1 minute to the time on this clock.
    public void tick() {
        if (this.hours == 23 && this.minutes == 59) {
            this.hours = 0;
            this.minutes = 0;
        }
        else if (this.minutes == 59) {
            this.minutes = 0;
            this.hours++;
        }
        else {
            this.minutes ++;
        }
    }

    // Exercise #6.6
    // Adds delta minutes to the time on this clock.
    public void tock(int delta) {
        int totalMinutes = hours * 60 + minutes + delta;
        totalMinutes %= (24 * 60);
        hours = totalMinutes / 60;
        minutes = totalMinutes % 60;
    }
    
    // Getters Added:
	
    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    
}
