import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfProperElementsTest {

    @Test
    public void sumOfProper1() {
        int[] nums1 = {1, 2, 6};
        assertEquals(9, SumOfProperElements.sumOfProper(nums1));
    }
    @Test
    public void sumOfProper2() {
        int[] nums2 = {10, 25};
        assertEquals(10, SumOfProperElements.sumOfProper(nums2));
    }
    @Test
    public void sumOfProperNegtive() {
        int[] nums3 = {-5, -2, -8};
        assertEquals(-7, SumOfProperElements.sumOfProper(nums3));
    }
    @Test
    public void sumOfProper_0() {
        int[] nums4 = {};
        assertEquals(0, SumOfProperElements.sumOfProper(nums4));
    }
    @Test
    public void sumOfProperEmpty() {
        int[] nums5 = null;
        assertEquals(0, SumOfProperElements.sumOfProper(nums5));
    }
    @Test
    public void sumOfProperAllRight() {
        int[] nums6 = {5, 10, 15, 20, 25, 30};
        assertEquals(105, SumOfProperElements.sumOfProper(nums6));
    }
    @Test
    public void sumOfProperInput0() {
        int[] nums7 = {0};
        assertEquals(0, SumOfProperElements.sumOfProper(nums7));
    }
    @Test
    public void sumOfProperSingle() {
        int[] nums8 = {5};
        assertEquals(5, SumOfProperElements.sumOfProper(nums8));
    }
    @Test
    public void sumOfProperThree0() {
        int[] nums9 = {0, 0, 0};
        assertEquals(0, SumOfProperElements.sumOfProper(nums9));
    }
}