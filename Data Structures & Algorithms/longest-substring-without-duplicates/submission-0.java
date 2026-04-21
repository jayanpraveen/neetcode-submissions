class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Set<Character> set = new HashSet<>();
        int j = 0; // left
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (set.contains(ch)) {
                set.remove(s.charAt(j));
                j++;
            }

            maxLength = Math.max(maxLength, i - j + 1);
            set.add(ch);
        }

        return maxLength;
    }
}
