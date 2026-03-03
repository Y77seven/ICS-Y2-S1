import java.util.Scanner;
public class CW131 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n =Integer.parseInt(scanner.nextLine());
        if (n<=1){
            System.out.println("false");
        }
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if (sum==n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
