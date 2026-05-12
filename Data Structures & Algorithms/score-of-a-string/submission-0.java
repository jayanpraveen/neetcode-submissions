class Solution {
    public int scoreOfString(String s) {
       int sum = 0;
        for (int i = s.length()-1; i > 0; i--) {
            sum += Math.abs((int)s.charAt(i) - (int)s.charAt(i-1));
        }
       return sum; 
    }
}