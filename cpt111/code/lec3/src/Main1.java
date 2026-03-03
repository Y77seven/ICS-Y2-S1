import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
/*
        //逻辑符号前后必须是布尔类型的数据
        //&&：and   ||:or  !a:not
        boolean a = true;
        boolean b = false;
        int c = 35;
        int d = 76;
        //c>40:False  d>20:True
        System.out.println(c>40&&d>20);
*/

       /* boolean c = true;
        int d = 1005;
        System.out.println(c||d>233);
        */
        //Postfix 运算符（后缀运算符）  应用于变量而不是常量
        //优先级最高，形式为 expr++ 或 expr--，用于对变量进行自增 / 自减操作，先使用变量当前值，再更新变量。
     /*   int a = 5;
        int b = a++;//先将a的当前值（5）赋值给b，再执行a = a + 1
        System.out.println(b);
        System.out.println(a);
        System.out.println(a++);//先输出a的当前值6，再执行a=a+1
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a++);*/

       //java if 初体验
       /* Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if(num<0){
            num= -num;
        }
        System.out.println(num);
        */

        //java if-else初体验
       /*
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int max;
        if (x > y) {
            max = x;
        }
        else {
            max = y;
        }
        System.out.println(max);
        */
    /*    Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int max;
        if (x > y) {
            System.out.println("max="+x);
        }
        else {
            System.out.println("max="+y);
        }
*/

        /*
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num < 0) {
            System.out.println("Negative");
        }
        else if (num == 0) {
            System.out.println("Zero");
        }
        else {
            System.out.println("Positive");
        }
        */
        //if else else if 是同级关系 else里面可以再嵌套if
        /*
        Scanner scanner = new Scanner(System.in);
        int score = Integer.parseInt(scanner.nextLine());
        if (score < 40)
            System.out.println("Fail");
        else{
            if (score < 50)
                System.out.println("Thrid Class");
            else {
                if (score < 60)
                    System.out.println("Lower Second Class");
                else {
                    if (score < 70)
                        System.out.println("Upper Third Class");
                    else
                        System.out.println("First Class");
                }

            }*/

        //简单的while循环
        /*int count = 10;
        while (count >=1){
            System.out.println(count);
            count -=1;
        }*/
      /*  Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i =1 , val = 1;
        while(i<=n+1){
            System.out.println(val);
            val = val *2;
            i +=1;
        }*/
    }
}
