public class SumOfProperElements {
    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 6};
//        System.out.println(sumOfProper(nums1));
//        int[] nums2 = {10, 25};
//        System.out.println(sumOfProper(nums2));
//        int[] nums3 = {-5, -2, -7};
//        System.out.println(sumOfProper(nums3));
    }
    public static int sumOfProper(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] % (i + 1) == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }
}
