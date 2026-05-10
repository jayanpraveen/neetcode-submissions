class Solution {
    public int trap(int[] height) {
        int[] min = new int[height.length];
        int[] max = new int[height.length];

        min[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            min[i] = Math.max(min[i-1], height[i]);
        }

        max[height.length-1] = height[height.length-1];
        for (int i = height.length-2; i >= 0; i--) {
            max[i] = Math.max(max[i+1], height[i]);
        }

        int[] capacity = new int[height.length];
        for (int i = 0; i < height.length; i++) {
            int value = Math.min(max[i], min[i]) - height[i];
            capacity[i] = value < 0 ? 0 : value;
        }
        
        return Arrays.stream(capacity).sum();
    }
}
