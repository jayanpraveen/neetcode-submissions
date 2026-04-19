class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ls = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {

            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int idx = Integer.parseInt(str.substring(i, j));
            System.out.println(idx);

            ls.add(str.substring(j + 1, idx + j + 1));
            i = idx + j + 1;
        }
        return ls;
    }
}
