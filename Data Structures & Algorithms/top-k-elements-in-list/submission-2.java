class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));

        for (Integer num : map.keySet()) {
            maxHeap.offer(num);
        }

        int[] res = new int[k];
        int i = 0;
        while (k > 0 && !maxHeap.isEmpty()) {
            res[i++] = maxHeap.poll();
            k--;
        }
        return res;
    }
}
