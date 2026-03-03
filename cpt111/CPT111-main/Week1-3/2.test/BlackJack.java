import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int m = Integer.parseInt(input.nextLine());
        if (n <= 21 && m <= 21) {
            if (21 - n > 21 - m) {
                System.out.println(m);
            }
            else {
                System.out.println(n);
            }
        }
        else if (n > 21 && m > 21) {
            System.out.println("-1");
        }
        else {
            if (n < 21){
                System.out.println(n);
            }
            else {
                System.out.println(m);
            }
        }
    }
}
