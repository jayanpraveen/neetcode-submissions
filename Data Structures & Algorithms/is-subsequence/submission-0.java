class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }

        int i = 0;
        for (char ch: t.toCharArray()) {
            if (i < s.length() && arr[i] == ch) {
                i++;
            }
        }

        return i == s.length();
        
    }
}