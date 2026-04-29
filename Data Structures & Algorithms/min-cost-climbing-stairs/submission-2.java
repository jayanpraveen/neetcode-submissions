class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+1];
        dp[0] = 0; // cost of climbing to idx 0 is 0, initial
        dp[1] = 0; // cost of climbing to idx 1 is 0, initial

        for (int i = 2; i <= cost.length; i++) {
            // cost[i-1] + dp[i-1] : cost of climbing from (i - 1) + cost of reaching (i-1) from previous 
            dp[i] = Math.min(cost[i-1] + dp[i-1], cost[i-2] + dp[i-2]);
        }
        return dp[cost.length];
    }
}
