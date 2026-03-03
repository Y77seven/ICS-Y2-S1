import java.util.Scanner;
public class CW121 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double Y = Double.parseDouble(scan.nextLine());
        double I = Double.parseDouble(scan.nextLine());
        double Q = Double.parseDouble(scan.nextLine());
        double R =(Y + 0.956*I + 0.619*Q)*255;
        double G =(Y - 0.272*I - 0.647*Q)*255;
        double B =(Y - 1.106*I + 1.703*Q)*255;
        int R1 =(int) Math.round(R);
        int G1 = (int) Math.round(G);
        int B1 =(int) Math.round(B);
        int R2 = Math.max(0,Math.min(R1,255));
        int G2 = Math.max(0,Math.min(G1,255));
        int B2 = Math.max(0,Math.min(B1,255));

        System.out.println("red = "+R2);
        System.out.println("green = "+G2);
        System.out.println("blue = "+B2);
    }
}
