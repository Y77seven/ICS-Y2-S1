import java.util.Arrays;

public class EvenOddSwap {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4};
        printInts(evenOddSwap(nums1));
        int[] nums2 = {100, 25};
        printInts(evenOddSwap(nums2));
        int[] nums3 = {};
        printInts(evenOddSwap(nums3));
        int[] nums4 = {11, 55, 100, 200, 300, 7};
        printInts(evenOddSwap(nums4));
    }
    public static int[] evenOddSwap(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[0];

        int n = nums.length;

        // 分别创建两个数组来保存奇数和偶数
        int[] odds = new int[n / 2];
        int[] evens = new int[n / 2];
        int oddCount = 0;
        int evenCount = 0;

        // 第一次遍历：分开奇偶
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                evens[evenCount] = nums[i];
                evenCount++;
            } else {
                odds[oddCount] = nums[i];
                oddCount++;
            }
        }

        // 再次遍历：依次替换
        int oddIndex = 0;
        int evenIndex = 0;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                // 原本是偶数 → 换奇数
                result[i] = odds[oddIndex];
                oddIndex++;
            } else {
                // 原本是奇数 → 换偶数
                result[i] = evens[evenIndex];
                evenIndex++;
            }
        }

        return result;

    }
    public static void printInts(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}
