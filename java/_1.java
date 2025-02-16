import java.util.HashMap;
import java.util.Map;

class _1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; ++i) {
            Integer j = map.get(target - nums[i]);
            if (j != null) {
                return new int[] { j, i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }
}
