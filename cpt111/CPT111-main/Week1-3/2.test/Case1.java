import java.util.Scanner;

public class Case1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int count = 0;
        while (n != 1){
            if (n % 2 == 0){
                n = n /2;
                count++;
            }
            else {
                n = 3 * n + 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
