import java.util.Scanner;
public class Exe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());
        double s = 2*r*Math.sin(Math.PI/5);
        double Area = 5*s*s/(4*Math.tan(Math.PI/5));
        System.out.println("Area = "+Area);
    }
}
