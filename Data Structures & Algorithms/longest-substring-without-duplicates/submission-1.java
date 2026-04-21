class Solution {
    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        int j = 0; // left
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                j = Math.max(map.get(ch)+1, j); // using max to not let j mv backwards; case: "abbba" when charAt(4). Adding +1 as i is already at found duplicate char, so instead we mv j to next char
            }
            map.put(ch, i); // latest idx of ch
            maxLength = Math.max(maxLength, i - j + 1); 
        }
        return maxLength;
        
    }
}
