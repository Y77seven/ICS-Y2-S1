/**
 * CW2 Week #6
 */

public class Temperature {
    private double celsius;

    public Temperature() {
        // TODO: set the initial value of celsius to 0.0
        this.celsius = 0.0;
    }

    public Temperature(double celsius) {
        // TODO: set the initial value for celsius
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        // TODO: calculate and return Fahrenheit equivalent
        return celsius * 1.8 + 32;
    }

    public void increase(double deltaC) {
        // TODO: add deltaC to current celsius value (can be negative)
        this.celsius += deltaC;
    }

    public boolean isBelowFreezing() {
        // TODO: return true of the temperature is strictly less than 0.0°C, false if not
        if  (this.celsius < 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        // TODO: return properly formatted string
        String str = String.format("%.0fC (%.0fF)",getCelsius(), getFahrenheit());
        return str;
    }

    public static void main(String[] args) {
        Temperature t0 = new Temperature();
        System.out.println(t0.getCelsius());
        System.out.println(t0.getFahrenheit());
        System.out.println(t0);

        Temperature t1 = new Temperature(-1.5);
        System.out.println(t1.isBelowFreezing());
        t1.increase(3.0);
        System.out.println(t1.getCelsius());
        t1.increase(-5.5);
        System.out.println(t1.getCelsius());
        System.out.println(t1.isBelowFreezing());
        System.out.println(t1.getFahrenheit());
    }
}

