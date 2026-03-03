import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        double output = 0.0;
        while (number > 0) {
            output =  1.0 /number + output;
            number--;
        }

        System.out.println(output);
    }
}
