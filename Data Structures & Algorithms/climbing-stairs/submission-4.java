class Solution {
    public int climbStairs(int n) {        
        int ways1 = 1;
        int ways2 = 2;

        if (n == ways1) return 1;
        if (n == ways2) return 2;

        int waysToReachN = ways1 + ways2;
        for (int i = 3; i <= n; i++)  {
            waysToReachN = ways1 + ways2;
            ways1 = ways2;
            ways2 = waysToReachN;
        }
        return waysToReachN;
    }
}
