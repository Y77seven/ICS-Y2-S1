import java.util.Scanner;

public class PolarCoordinates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double x = Double.parseDouble(input);

        input = scanner.nextLine();
        double y = Double.parseDouble(input);

        double theta = Math.atan2(y, x);

        double r =  Math.sqrt(y * y + x * x);

        System.out.println("r = " + r + "\n"+"theta = " + theta);


    }
}


