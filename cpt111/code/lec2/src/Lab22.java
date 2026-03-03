/*
import java.util.Scanner;
public class Lab22 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double cyan = Double.parseDouble(scanner.nextLine());
        double magenta = Double.parseDouble(scanner.nextLine());
        double yellow =  Double.parseDouble(scanner.nextLine());
        double black =   Double.parseDouble(scanner.nextLine());
        double white = 1- black;
        long red = Math.round(255*white*(1-cyan));
        long green = Math.round(255*white*(1-magenta));
        long blue = Math.round(255*white*(1-yellow));
        System.out.println("red = " + red +"\ngreen = "+green +"\nblue = "+blue);
*/

        //double cyan1 = Double.parseDouble(scanner.nextLine());
        /*double cyan = scanner.nextDouble();
        double magenta = scanner.nextDouble();
        double yellow = scanner.nextDouble();
        double black = scanner.nextDouble();
    }
}
*/

import java.util.Scanner;
public class Lab22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double cyan =Double.parseDouble(sc.nextLine());
        double magenta =Double.parseDouble(sc.nextLine());
        double yellow =Double.parseDouble(sc.nextLine());
        double black =Double.parseDouble(sc.nextLine());
        double white = 1-black;
        long red = Math.round(255*white*(1-cyan));
        long green = Math.round(255*white*(1-magenta));
        long blue = Math.round(255*white*(1-yellow));
        System.out.println("red = "+ red +"\ngreen = "+ green +"\nblue = "+ blue);
    }
}