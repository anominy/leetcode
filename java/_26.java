class _26 {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 0; i < nums.length - 1; ++i) {
            int n0 = nums[i];
            int n1 = nums[i + 1];

            if (n0 < n1) {
                nums[k] = n1;
                ++k;
            }
        }
        return k;
    }
}
