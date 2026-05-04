class Solution {
    int[][] memo;
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        memo = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            Arrays.fill(memo[i], -1);
        }
        return Math.max(x(nums, 1, 1), x(nums, 0, 0));
    }

    public int x(int[] nums, int i, int start) {

        if (i >= nums.length) return 0;
        if (i == nums.length - 1 && start % 2 == 0) {
            return 0;
        }

        if (memo[i][start] != -1) return memo[i][start];
        memo[i][start] = Math.max(nums[i] + x(nums, i+2, start), 0 + x(nums, i+1, start));
        return memo[i][start];
    }
}
