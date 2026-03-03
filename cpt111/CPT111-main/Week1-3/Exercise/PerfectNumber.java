import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x  = input.nextInt();
        if (x < 0) {
            System.out.println("false");
        }
        else {
            int [] properFactors;
            int j = 0;
            for (int i = 1; i < x; i++) {
                if (x % i == 0) {
                    j++;
                }
                continue;
            }
            if (j != 0) {
                properFactors = new int [j];
                int k = 0;
                for (int n = 1; n < x; n++) {
                    if (x % n == 0) {
                        properFactors[k] = n;
                        if (k < j - 1){
                            k++;
                        }
                    }
                }
                int sum = 0;
                for (int i = 0; i < j; i++) {
                    sum += properFactors[i];
                }
                if (sum == x) {
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
}
