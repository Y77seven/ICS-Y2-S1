import java.util.Scanner;
public class exe31 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Double H=0.0;
        int i =1;
        while(i<=n){
            H =H +1.0/i;
            i++;
        }
        System.out.println(H);
    }
}
