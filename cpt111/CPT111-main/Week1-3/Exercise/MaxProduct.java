public class MaxProduct {
    public static void main(String[] args) {
        int[] arr1 = {-10, 5, -2, 1, 6};
        System.out.println(maxProduct(arr1));
        int[] arr2 = {-1, 2};
        System.out.println(maxProduct(arr2));
        int[] arr3 = {1};
        System.out.println(maxProduct(arr3));
        int[] arr4 = {5,5,3};
        System.out.println(maxProduct(arr4));
        int[] arr5 = {-5,-5,3};
        System.out.println(maxProduct(arr5));
    }
    public static int maxProduct(int[] arr) {
        if (arr == null || arr.length == 0 || arr.length == 1) {
            return 0;
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max1 = arr[i];
            }
        }
        int countMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max1) {
                countMax++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (countMax >1){
                max2 = max1;
            }
            else if (arr[i] > max2 && arr[i] < max1) {
                max2 = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min1 = arr[i];
            }
        }
        int countMin = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min1) {
                countMin++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (countMin >1) {
                min2 = min1;
            }
            else if (arr[i] < min2 && arr[i] > min1) {
                min2 = arr[i];
            }
        }
        return Math.max(max1 * max2, min1 * min2);
    }
}
