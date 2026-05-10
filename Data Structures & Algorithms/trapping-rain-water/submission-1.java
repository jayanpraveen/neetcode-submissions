class Solution {
    public int trap(int[] height) {
        int leftMax = height[0];
        int rightMax = height[height.length-1];

        int left = 0;
        int right = height.length-1;
        int total = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                total += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                total += rightMax - height[right];
            }
        }
        return total;
    }
}
/**
 *  Why Move the Smaller Side?

    In the two-pointer approach, we maintain left_max and right_max.
    When we see that height[left] < height[right], we can make a bold assumption about the water at the left pointer:

    1. We know left_max is the tallest thing we've seen on the left so far.
    2. We know there is at least one wall on the right (height[right]) that is taller than height[left].
    3. Therefore, even if we don't know the absolute tallest wall on the right, we know that the "limiting factor" for the left pointer cannot be the right side. It must be left_max.
 */