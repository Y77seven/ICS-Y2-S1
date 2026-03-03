import java.util.Scanner;

public class PerfectNumber2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x  = in.nextInt();
        if (x < 0) {
            System.out.println("false");
        }
        else {
            int sum = 0;
            for (int i = 1; i < x; i++) {
                if (x % i == 0) {
                    sum += i;
                }
                continue;
            }
            if (sum == x) {
                    System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }
}

