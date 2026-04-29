class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] dp = new int[n + 1];

        dp[n - 1] = 1; // one jump to top
        dp[n - 2] = 2; // one jump to top

        // n - 3 to start at step 3 i.e when n = 5.
        for (int i = n - 3; i >= 0; i--) {
            dp[i] = dp[i + 1] + dp[i + 2];
        }

        return dp[0];
    }
}