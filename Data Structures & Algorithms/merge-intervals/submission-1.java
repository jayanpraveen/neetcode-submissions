class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> list = new ArrayList<>();
        // int[][] result = new int[intervals.length][2];
        list.add(intervals[0]);
        int lastSeenStart = intervals[0][0];
        int j = 0;
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (lastSeenStart == start) {
                int lastSeenEnd = list.get(list.size() - 1)[1];
                int maxEnd = Math.max(lastSeenEnd, end);
                // result[j] = new int[] { start, maxEnd };
                if (j < list.size()) {
                    list.set(j, new int[] {start, maxEnd});
                } else {
                    list.add(new int[] {start, maxEnd});
                }
            } else {
                // int lastMaxEnd = result[j][1];
                int lastEnd = list.get(j)[1];
                if (lastEnd >= start) {
                    int lastMaxEnd = Math.max(lastEnd, end);
                    // result[j] = new int[] { lastSeenStart, end };
                    if (j < list.size()) {
                        list.set(j, new int[] {lastSeenStart, lastMaxEnd});
                    } else {
                        list.add(new int[] {lastSeenStart, lastMaxEnd});
                    }
                } else {
                    j++;
                    // result[j] = new int[] { start, end };
                    if (j < list.size()) {
                        list.set(j, new int[] {start, end});
                    } else {
                        list.add(new int[] {start, end});
                    }
                    lastSeenStart = start;
                }
            }

        }

        return list.toArray(new int[list.size()][]);
    }
}
