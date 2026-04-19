class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            // move the left pointer until current char is rm'd
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
            }
            maxLen = Math.max(maxLen, i - j + 1);
            set.add(s.charAt(i));
        }
        return maxLen;
    }
}
