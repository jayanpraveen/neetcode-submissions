class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = Arrays.toString(chars);
            map.putIfAbsent(key, new ArrayList<>());
            List<String> ls = map.get(key);
            ls.add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
