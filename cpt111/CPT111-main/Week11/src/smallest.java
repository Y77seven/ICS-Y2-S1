public class smallest {
    public static int smallest(int[] array) {
        return smallest(array, 0);
    }

    private static int smallest(int[] array, int start) {
        // base case
        if (start == array.length - 1) {
            return array[start];
        }
        // recursive step
        int smallestInRest = smallest(array, start + 1);
        return Math.min(array[start], smallestInRest);
    }
}
