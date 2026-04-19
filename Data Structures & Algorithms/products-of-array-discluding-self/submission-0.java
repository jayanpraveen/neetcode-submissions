class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;

        boolean isZeroPresent = false;
        for (int i = 0; i < nums.length; i++) {
            if (!isZeroPresent && nums[i] == 0) {
                isZeroPresent = true;
            } else {
                product *= nums[i];
            }
        }

        int[] result = new int[nums.length];

        int i = 0;
        for (Integer num : nums) {
            if (isZeroPresent) {
                if (num == 0) {
                    result[i++] = product;
                } else {
                    result[i++] = 0;
                }
            } else {
                result[i++] = product / num;
            }
        }

        return result;
    }
}
