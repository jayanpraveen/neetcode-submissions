class Solution {
    Boolean[] memo;
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set = new HashSet<>(wordDict);
        memo = new Boolean[s.length()];
        return x(s, set, 0);
    }
    public boolean x(String s, HashSet<String> set, int i) {
        if (i >= s.length()) {
            return true;
        }
        
        if (memo[i] != null) return memo[i];

        for (int k = i+1; k <= s.length(); k++) {
            String word = s.substring(i, k);
            if (set.contains(word)) {
                if (x(s, set, k)) {
                    memo[i] = true;
                    return true;
                }
            }
        }
        memo[i] = false;
        return false;
    }
}