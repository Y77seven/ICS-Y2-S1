import java.util.Scanner;
public class exe34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 =Integer.parseInt(scanner.nextLine());
        int n2 =Integer.parseInt(scanner.nextLine());
        int n3 =Integer.parseInt(scanner.nextLine());
        int max = Math.max(Math.max(n1, n2), n3);
        int min = Math.min(Math.min(n1, n2), n3);
        // 中间值 = 总和 - 最大值 - 最小值
        int mid = n1 + n2 + n3 - max - min;
        if (n1<=0 || n2<=0 || n3<=0){
            System.out.println("false");
        }
        else if (min * min + mid * mid == max * max){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
