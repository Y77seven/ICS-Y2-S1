import java.util.Scanner;
public class lab31 {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        int count =0; //找到阿姆斯特朗数的个数
        int num = a;  //当前找的数字

        while(count<k) {
            int temp = num;
            int digits = 0;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            temp = num;
            int sum = 0;
            for (; temp > 0; ) {
                int digit = temp % 10;
                int power = (int) Math.pow(digit, digits);
                sum += power;
                temp /= 10;
            }
            if (sum==num){
                System.out.println(num);
                count++;
            }
            num++;
        }*/
        Scanner scanner = new Scanner(System.in);
        int a =Integer.parseInt(scanner.nextLine());
        int k =Integer.parseInt(scanner.nextLine());
        int num=a;
        int count=0;
        while(count<k){
            int temp=num;
            int digits=0;
            while (temp>0){
                temp/=10;
                digits++;
            }
            int sum=0;
            int temp1=num;
            for(;temp1>0;){
                int digit=temp1%10;
                int power=(int) Math.pow(digit,digits);
                sum+=power;
                temp1=temp1/10;
            }
            if (sum==num){
                System.out.println(num);
                count++;
            }
            num++;
        }

    }
}
