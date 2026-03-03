import java.util.Scanner;
public class debug2 {
    public static void main(String[] args) {
        Scanner color = new Scanner(System.in);
        double cyan = Double.parseDouble(color.nextLine());
        double magenta = Double.parseDouble(color.nextLine());
        double yellow = Double.parseDouble(color.nextLine());
        double black = Double.parseDouble(color.nextLine());

        double white = 1 - black;
        int red = (int) (255 * white * (1 - cyan));
        int green = (int) (255 * white * (1 - magenta));
        int blue = (int) (255 * white * (1 - yellow));

        System.out.println("red = " + red +"\n" + "green = " + green + "\n" + "blue = " + blue);

    }
}
