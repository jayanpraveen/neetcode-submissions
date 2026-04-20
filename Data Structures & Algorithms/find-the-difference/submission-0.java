class Solution {
    public char findTheDifference(String s, String t) {
        int sSum = 0;
        int tSum = 0;
        for (Character str: s.toCharArray()) {
            sSum += (int) str;
        }
        for (Character str: t.toCharArray()) {
            tSum += (int) str;
        }
        return (char) (tSum - sSum);
    }
}