class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0;
        int j = m - 1;
        while (j >= 0 && i < n) {
            int val = matrix[i][j];
            if (val == target) {
                return true;
            } else if (val < target) {
                i++;
            } else {
                j--;
            }
        }

        // for (int i = 0; i < n; i++) {
        //     for (int j = m - 1; j >= 0; j--) {
        //         if (matrix[i][j] == target) {
        //             return true;
        //         }
        //     }
        // }

        return false;
    }
}