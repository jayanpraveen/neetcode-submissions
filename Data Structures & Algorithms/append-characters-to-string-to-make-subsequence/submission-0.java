class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if ((t.charAt(j) == s.charAt(i))) {
                i++;
                j++;
            } else {
                while (i < s.length() && (t.charAt(j) != s.charAt(i))) {
                    System.out.println(t.charAt(j) + ":" + s.charAt(i));
                    i++;
                }
            }
        }

        System.out.println(j + ":" + i);
        return j >= t.length() ? 0 : t.length() - j;
    }
}