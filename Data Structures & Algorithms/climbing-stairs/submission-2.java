class Solution {
    public int climbStairs(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;

        int[] dp = new int[n+1]; // n+1 because we start from 5 and reach till 0.
        dp[0] = 1; // number of ways to reach n, not number of moves. from 5 i can reach 5 at 1 possible way.
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
}
