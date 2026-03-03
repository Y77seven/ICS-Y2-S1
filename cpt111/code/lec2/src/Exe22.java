import java.util.Scanner;
public class Exe22 {
    public static void main(String[] args){
        double r = 6371.0;
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double dist = 2*r*Math.asin(Math.sqrt(Math.pow(Math.sin(Math.toRadians((x2-x1)/2)),2)+Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.pow(Math.sin(Math.toRadians((y2-y1)/2)),2)));
        System.out.println(dist+" kilometers");
    }
}
