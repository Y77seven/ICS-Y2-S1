import java.util.Scanner;

public class exe33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int init =Integer.parseInt(sc.nextLine());
        int numInfect = Integer.parseInt(sc.nextLine());
        int population = Integer.parseInt(sc.nextLine());
        int n =0;
        while(init<population){
            init=init+init*numInfect;
            n+=1;
        }
        System.out.println(n+1);
    }
}
