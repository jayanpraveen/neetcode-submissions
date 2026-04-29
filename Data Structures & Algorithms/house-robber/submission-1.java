class Solution {
    int[] memo;
    public int rob(int[] nums) {
        int n = nums.length;
        memo = new int[n];
        Arrays.fill(memo, -1);
        return x(nums, n-1);
    }
    
    public int x(int[] nums, int n) {
        if (n < 0) return 0;
        if (memo[n] != -1) return memo[n];
        memo[n] = Math.max(nums[n] + x(nums, n-2), 0 + x(nums, n-1));
        return memo[n];
    }
}
