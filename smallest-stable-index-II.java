class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int maxm = nums[0];
        int[] minm = new int[n];
        minm[n - 1] = nums[n - 1];
        for(int i = n - 2; i >= 0; -- i)
            minm[i] = Math.min(minm[i + 1], nums[i]);
        for(int i = 0; i < n; ++ i) {
            maxm = Math.max(maxm, nums[i]);
            if (maxm - minm[i] <= k) return i;
        }
        return - 1;
    }
}
