class Solution {
    int[][] memo;
    public int minPathSum(int[][] grid) {
        memo = new int[grid.length][grid[0].length];
        for (int[] arr : memo) {
            Arrays.fill(arr, -1);
        }
        return x(grid, grid.length - 1, grid[0].length - 1);
    }

    public int x(int[][] grid, int i, int j) {
        if (i == 0 && j == 0)
            return grid[0][0];
        if (i < 0 || j < 0)
            return Integer.MAX_VALUE; // if we return 0, then Math.min will take 0, to avoid it we take MAX_VALUE 
        if (memo[i][j] != -1) return memo[i][j];
        memo[i][j] = grid[i][j] + Math.min(x(grid, i - 1, j), x(grid, i, j - 1));
        return memo[i][j];
    }
}