import java.util.Scanner;
public class labC {
    public static void main(String[] args){
        /*
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i=1;
        while(n!=1){
            if(n%2==0){
                n/=2;
            }
            else{
                n=3*n+1;
            }
            i++;
        }
        System.out.println(i);
        */
        Scanner scanner= new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int i=1;
        while (n!=1){
            if(n%2==0){
                n/=2;
            }
            else{
                n=3*n+1;
            }
            i++;
        }
        System.out.println(i);
    }
}
