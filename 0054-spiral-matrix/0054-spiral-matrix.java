class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;
        List<Integer> ll = new ArrayList<>();
        while (startRow <= endRow && startCol <= endCol) {
            //top
            for (int j = startCol; j <= endCol; j++) {
                ll.add(matrix[startRow][j]);
            }
            //right
            for (int j = startRow + 1; j <= endRow; j++) {
                ll.add(matrix[j][endCol]);
            }
            //bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                ll.add(matrix[endRow][j]);
            }
            //left
            for (int j = endRow - 1; j >= startRow + 1; j--) {
                if (startCol == endCol) {
                    break;
                }
                ll.add(matrix[j][startCol]);
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }
        return ll;
    }
}