class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(intervals[0][0], intervals[0][1]);
        int lastStart = intervals[0][0];
        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            int lastEnd = map.get(lastStart);

            if (lastEnd >= start) {
                map.put(lastStart, Math.max(map.get(lastStart), end));
            } else {
                map.put(start, end);
                lastStart = start;
            }
        }

        System.out.println(map);
        int[][] result = new int[map.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[i++] = new int[] {entry.getKey(), entry.getValue()};
        }
        return result;
    }
}
