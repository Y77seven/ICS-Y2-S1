import java.util.Scanner;
public class exe32 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
/*
        if (n1>0&&n2>0){
            if (n1>21&&n2>21){
                System.out.println("-1");
            }
            else if (n1>21&&n2<=21){
                System.out.println(n2);
            }
            else if (n2>21&&n1<=21){
                System.out.println(n1);
            }
            else{
                  if(21-n1<21-n2){
                    System.out.println(n1);
                         }
                  else{
                    System.out.println(n2);
                    }

            }
        }
*/
        if (n1>21&&n2>21){
            System.out.println("-1");
        }
        else if (n1>21&&n2<21){
            System.out.println(n2);
        }
        else if (n1<21&&n2>21){
            System.out.println(n1);
        }
        else{
            System.out.println(Math.max(n1,n2));
        }
    }
}
