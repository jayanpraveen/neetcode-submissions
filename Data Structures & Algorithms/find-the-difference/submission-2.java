class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
        }
        
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            if (map.get(key) > 0) {
               return key; 
            }
        }
        
        return 'x'; // dummy
    }
}