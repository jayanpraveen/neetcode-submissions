class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length+1];
        Arrays.fill(dp, -1);
        return x(-1, cost); // -1 signifies starting from before 0, not yet climbed state, i.e consider groud floor
    }
    public int x(int i, int[] cost) {
        if (i > cost.length-1) return 0;
        if (dp[i+1] != -1) return dp[i+1]; // using i+1 because, when idx fails when -1. So we store the cache at i+1 
        int currCost = i == -1 ? 0 : cost[i];
        dp[i+1] = Math.min(currCost + x(i+1, cost), currCost + x(i+2, cost));
        return dp[i+1];
    }
}
