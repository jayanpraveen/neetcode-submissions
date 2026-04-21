class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        for (int i = 0; i < k; i++) {
            int x = nums[nums.length-1]; // tmp store last element
            for (int j = nums.length-2; j >= 0; j--) {
                nums[j+1] = nums[j]; // from last push one element fwd  
            }
            nums[0] = x; // replace nums[0] with tmp
        }
    }
}