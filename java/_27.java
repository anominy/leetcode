class _27 {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; ++i) {
            int n = nums[i];
            if (n == val) {
                continue;
            }
            nums[k] = n;
            ++k;
        }
        return k;
    }
}
