class Solution {
    public int jump(int[] nums) {

        int maxJump = 0;
        int jumps = 0;
        int nextJump = 0;
        for (int i = 0; i < nums.length; i++) {
            // when reaching last index we should not futher jump, so break here;
            if (i == nums.length - 1) break; 

            /**
            * Intution:
            * find the maxJump for i, and when we jump, store maxJump as the nextJump
            * iterate i and calcualte the maxJump for each i
            * when we reach nextJump, we know we could jump at maxJump and we jump
            */
            maxJump = Math.max(maxJump, i+nums[i]);
            if (i == nextJump) {
                jumps++;
                nextJump = maxJump;
            }
        }
        return jumps;
    }
}