class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return x(m-1, n-1);
    }

    public int x(int i, int j) {
        if (i == 0 || j == 0) return 1;
        if (i < 0 || j < 0) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        int up = x(i-1, j);
        int left = x(i, j-1);
        dp[i][j] = up+left;
        return dp[i][j];
    }
}
