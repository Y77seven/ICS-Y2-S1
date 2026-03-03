import static java.lang.Integer.*;

public class MaxConsecutiveSum {
    public static void main(String[] args) {
        int[] arr1 = {-3, 5, -2, 3, -1};
        System.out.println(maxConsecutiveSum(arr1));
        int[] arr2 = {1, -1};
        System.out.println(maxConsecutiveSum(arr2));
        int[] arr3 = {-5, -2, -7};
        System.out.println(maxConsecutiveSum(arr3));
    }
    public static int maxConsecutiveSum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (currentSum < 0) {
                currentSum = arr[i];
            }
            else {
                currentSum += arr[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

        }
        return maxSum;
    }
}
