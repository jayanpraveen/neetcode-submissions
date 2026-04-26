class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return x(0, n, dp);
    }

    public static int x(int i, int n, int[] dp) {
        if (i == n)
            return 1;
        if (i > n) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        } else {
            dp[i] = x(i + 1, n, dp) + x(i + 2, n, dp);
            return dp[i];
        }
    }
}
