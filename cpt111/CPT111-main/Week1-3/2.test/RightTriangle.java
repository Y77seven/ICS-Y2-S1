import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            boolean x = a * a + b * b - c * c == 0;
            boolean y = a * a - b * b + c * c == 0;
            boolean z = a * a - b * b - c * c == 0;
            if (x || y || z) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        else {
            System.out.println("false");
        }
    }
}
