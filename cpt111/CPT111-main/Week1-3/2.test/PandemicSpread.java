import java.util.Scanner;

public class PandemicSpread {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int init = Integer.parseInt(input.nextLine());
        int num = Integer.parseInt(input.nextLine());
        int ppl = Integer.parseInt(input.nextLine());
        int infected = init;
        int day = 1;
        while (infected < ppl) {
            infected = infected * num +infected;
            day++;
        }
        System.out.println(day);
    }
}
