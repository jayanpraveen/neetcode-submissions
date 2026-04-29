class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(x(0, cost), x(1, cost));
    }
    public int x(int i, int[] cost) {
        if (i > cost.length-1) return 0;
        if (dp[i] != -1) return dp[i];
        dp[i] = Math.min(cost[i] + x(i+1, cost), cost[i] + x(i+2, cost));
        return dp[i];
    }
}
