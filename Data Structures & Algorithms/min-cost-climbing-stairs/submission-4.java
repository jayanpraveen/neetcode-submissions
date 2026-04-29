class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        // existing cost at step 0ith and 1th index 
        dp[0] = cost[0];
        dp[1] = cost[1];

        
        for (int i = 2; i < cost.length; i++) {

            // To reach current step i:
            // either come from step i-1 or step i-2
            //
            // dp[i-1] and dp[i-2] already include the total cost
            // to reach those steps (their costs are already calculated)
            //
            // So choose the cheaper previous path,
            // then add current step cost
            dp[i] = Math.min(dp[i-1], dp[i-2]) + cost[i];
        }

        // Top is one step beyond last index
        // Can reach top from last step or second last step
        // No cost for top itself
        return Math.min(dp[cost.length-1], dp[cost.length-2]);
    }
}
