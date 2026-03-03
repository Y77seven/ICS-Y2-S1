import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = Integer.parseInt(input.nextLine());
        int k = Integer.parseInt(input.nextLine());
        for (int i = a; ; i++) {
                boolean x = check(i);
                if (x){
                    System.out.println(i);
                    k = k - 1;
                    if (k == 0){
                        break;
                }
            }
        }
    }
    public static boolean check(int x){
        int countNum = x;
        int cNum = x;
        int number[];
        int count = 1;
        while (countNum /10 != 0){
            countNum = countNum / 10;
            count++;
        }
        number = new int[count];
        number[0] = cNum % 10;
        for (int i = 1; i < count; i++){
            cNum = cNum / 10;
            number[i] = cNum % 10;
        }
        int sum = 0;
        for (int i = 0; i < count; i++){
            sum = (int) (sum + Math.pow(number[i], count));
        }
        return sum == x;
    }
}