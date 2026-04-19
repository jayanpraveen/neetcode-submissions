class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (Integer num : nums) {
            set.add(num);
        }

        int max = 0;
        for (Integer num : nums) {
            if (!set.contains(num - 1)) {
                int curr = num;
                int len = 0;
                while (set.contains(num+len)) {
                    len++;
                    max = Math.max(max, len);
                }
            }
        }
        return max;
    }
}
