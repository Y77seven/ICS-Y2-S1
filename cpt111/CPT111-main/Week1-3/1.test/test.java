import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //double x = Math.sqrt(-1.0);
        //System.out.println(x);
       // boolean a = true;
//        boolean b = false;
//        System.out.println(a);
//        System.out.println(b);
//        int x = 10;
//        int y = 2;
//        int num = 1;
//
//            while (x /10 != 0){
//                x = x / 10;
//                num++;
//            }
//        System.out.println(num);

//        int y = 203;
//        System.out.println(y%10);
//        System.out.println(y/10);
//        int x = 1239;
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
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
        if (sum == x){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}

