class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        while (i < matrix.length) {
            if (target < matrix[i][matrix[0].length - 1]) {
                // System.out.println(i);
                int left = 0;
                int right = matrix[i].length - 1;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    System.out.println(matrix[i][mid]);
                    if (matrix[i][mid] > target) {
                        right = mid - 1;
                    } else if (matrix[i][mid] < target) {
                        left = mid + 1;
                    } else if (matrix[i][mid] == target) {
                        return true;
                    }
                }
                break;
            } else if (target == matrix[i][matrix[0].length - 1]) {
                return true;
            }
            i++;
        }

        return false;
    }
}
