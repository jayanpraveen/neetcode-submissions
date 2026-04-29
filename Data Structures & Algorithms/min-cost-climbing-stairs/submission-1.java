class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(x(cost, 0, dp), x(cost, 1, dp));
    }

    public static int x(int[] cost, int i, int[] dp) {
        if (i > cost.length - 1)
            return 0;
        if (dp[i] != -1) {
            return dp[i];
        }
        dp[i] = Math.min(cost[i] + x(cost, i + 1, dp), cost[i] + x(cost, i + 2, dp));
        return dp[i];
    }
}
