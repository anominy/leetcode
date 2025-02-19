import java.util.Arrays;

class _35 {
    public int searchInsert(int[] nums, int target) {
        int result = Arrays.binarySearch(nums, target);
        if (result < 0) {
            return -result - 1;
        }
        return result;
    }
}
