class Solution {
    public int missingNumber(int[] nums) {
        int sum = IntStream.rangeClosed(1, nums.length).sum();
        int numsSum = Arrays.stream(nums).sum();
        return sum - numsSum;
    }
}
