/*
import java.util.Scanner;
public class Lab21 {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double r =Math.sqrt(x*x+y*y);
        double theta = Math.atan2(y,x);
        System.out.println("r = "+ r+ "\ntheta = " + theta );
    }
}
*/
/*

import java.util.Scanner;
public class Lab21 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double x = Double.parseDouble(kb.nextLine());
        double y = Double.parseDouble(kb.nextLine());

        double r = Math.sqrt(x*x + y*y);
        double theta = Math.atan2(y, x);

        System.out.println("r = " + r);
        System.out.println("theta = " + theta);
        System.out.println("expected r = " + 0.0);
        System.out.println("expected theta = " + 0.0);

    }
}
*/

import java.util.Scanner;
public class Lab21 {
    public static void main(String[] args){
        Scanner kb=new Scanner(System.in);
        double x = Double.parseDouble(kb.nextLine());
        double y = Double.parseDouble(kb.nextLine());
        double r = Math.sqrt(x*x + y*y);
        double theta = Math.atan2(y,x);
        System.out.println("r = "+ r +"\ntheta = "+theta);
    }
}