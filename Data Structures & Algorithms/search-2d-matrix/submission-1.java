class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int down = matrix.length-1;
        while (top <= down) {
            int midRow = (top + down) / 2;
            if (target < matrix[midRow][0]) {
                down = midRow - 1;
            } else if (target > matrix[midRow][matrix[0].length-1]) {
                top = midRow + 1;
            } else {
                int left = 0;
                int right = matrix[midRow].length - 1;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (matrix[midRow][mid] > target) {
                        right = mid - 1;
                    } else if (matrix[midRow][mid] < target) {
                        left = mid + 1;
                    } else {
                        return true;
                    }
                }
                return false;
            }
        }

        return false;
    }
}
