import java.util.Scanner;

public class YIQtoRGB {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double Y =  Double.parseDouble(input.nextLine());
        double I =  Double.parseDouble(input.nextLine());
        double Q =  Double.parseDouble(input.nextLine());
        double R = Math.round((Y + 0.956 * I + 0.619 * Q) * 255);
        double G = Math.round((Y - 0.272 * I - 0.647 * Q) * 255);
        double B = Math.round((Y - 1.106 * I + 1.703 * Q) * 255);
        int r = (int) Math.round(Math.max(0, Math.min(255, R)));
        int g = (int) Math.round(Math.max(0, Math.min(255, G)));
        int b = (int) Math.round(Math.max(0, Math.min(255, B)));
        System.out.println("red = " + r);
        System.out.println("green = " + g);
        System.out.println("blue = " + b);
    }
}
