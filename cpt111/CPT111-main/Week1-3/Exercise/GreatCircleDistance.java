import java.util.Scanner;

public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r  =  6371.0;
        double x1 = Math.toRadians(input.nextDouble()); //Double.parseDouble(input.nextLine());
        double y1 = Math.toRadians(input.nextDouble());
        double x2 = Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());
//        x1 = Math.toRadians(x1);
//        y1 = Math.toRadians(y1);
//        x2 = Math.toRadians(x2);
//        y2 = Math.toRadians(y2);
        double root = Math.pow(Math.sin((x2-x1)/2),2) + Math.cos(x1)*Math.cos(x2)*Math.pow(Math.sin((y2-y1)/2),2);
        double distance = 2 * r * Math.asin(Math.sqrt(root));
        System.out.println(distance + " kilometres");
    }
}
