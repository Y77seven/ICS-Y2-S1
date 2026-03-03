public class ADiamondisFORever {
    public static void main(String[] args) {
        diamond(5);
        diamond(9);
    }
    public static void diamond(int n) {
        if (n % 2 == 0){
            return;
        }
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            int dist = Math.abs(mid - i);

            int stars = n - 2 * dist;

            for (int j = 0; j < n; j++) {
                if (j >= dist && j < dist + stars) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
                if (j < n - 1) System.out.print(" ");
            }

            System.out.println();
        }
    }
}
