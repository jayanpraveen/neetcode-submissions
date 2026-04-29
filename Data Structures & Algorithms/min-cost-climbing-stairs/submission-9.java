class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length+1];
        Arrays.fill(dp, -1);
        return x(cost.length, cost); 
    }
    public int x(int i, int[] cost) {
        if (i == 0) return 0; // if we reach step 0, as in starting from step 0
        if (i == 1) return 0; // if we reach step 1, as in starting from step 1

        if (dp[i] != -1) return dp[i];

        // To reach step i we can:
        // come from i-1 and pay cost[i-1]
        // or come from i-2 and pay cost[i-2]
        //
        // cost of previous steps is already included
        // in recursive calls
        dp[i] = Math.min(cost[i-1] + x(i-1, cost), cost[i-2] + x(i-2, cost));
        return dp[i];
    }
}
