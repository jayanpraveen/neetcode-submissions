class Solution {
    public boolean isPalindrome(String s) {
        s = s.toUpperCase();
        int left = 0;
        int right = s.length() - 1;
        boolean result = true;
        while (left < right) {
            char lch = s.charAt(left);
            char rch = s.charAt(right);

            if ((lch < 'A' || lch > 'Z') && (lch < '0' || lch > '9')) {
                left++;
                continue;
            }

            if ((rch < 'A' || rch > 'Z') && (rch < '0' || rch > '9')) {
                right--;
                continue;
            }

            if (s.charAt(left) != s.charAt(right)) {
                result = false;
                break;
            }
            left++;
            right--;
        }
        return result;
    }
}
