class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        list.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            int lastEnd = list.get(list.size() - 1)[1];

            if (lastEnd >= start) {
                int[] arr = list.get(list.size() - 1);
                arr[1] = Math.max(arr[1], end);
            } else {
                list.add(new int[] {start, end});
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
