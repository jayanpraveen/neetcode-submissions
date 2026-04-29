class Solution {
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n+1];
        Arrays.fill(memo, -1);
        return x(n);
    }

    public int x(int i) {
        if (i == 0) return 1; // if reach at step 0 then return 1 (count as valid)
        if (i < 0) return 0; // If reached below 0 then we not reach target, so dont count as valid
        
        if (memo[i] != -1) return memo[i];
        memo[i] = x(i-2) + x(i-1);
        return memo[i];
    }
}
