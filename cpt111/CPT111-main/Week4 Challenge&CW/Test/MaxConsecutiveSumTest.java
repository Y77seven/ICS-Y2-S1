import org.junit.Test;

import static org.junit.Assert.*;

public class MaxConsecutiveSumTest {

    @Test
    public void maxConsecutiveSum1() {
        int[] arr1 = {-3, 5, -2, 3, -1};
        assertEquals(6,MaxConsecutiveSum.maxConsecutiveSum(arr1));
    }
    @Test
    public void maxConsecutiveSum2() {
        int[] arr2 = {1, -1};
        assertEquals(1,MaxConsecutiveSum.maxConsecutiveSum(arr2));
    }
    @Test
    public void maxConsecutiveSum3() {
        int[] arr3 = {-5, -2, -7};
        assertEquals(-2,MaxConsecutiveSum.maxConsecutiveSum(arr3));
    }
}