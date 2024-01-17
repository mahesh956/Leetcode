class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        int row = 0, col = 0;
        int maxRow = matrix.length - 1;
        int maxCol = matrix[0].length - 1;
        int minRow = 0, minCol = 0;
        int dir = 0; // 0-right, 1-down, 2-left, 3-up

        while (res.size() < matrix.length * matrix[0].length) {
            res.add(matrix[row][col]);
            if (dir == 0) {
                if (col == maxCol) {
                    dir = 1;
                    maxCol--;
                } else {
                    col++;
                }
            }
            if (dir == 1) {
                if (row == maxRow) {
                    dir = 2;
                    maxRow--;
                    minRow += 1;
                } else {
                    row++;
                }
            }
            if (dir == 2) {
                if (col == minCol) {
                    dir = 3;
                    minCol += 1;
                } else {
                    col--;
                }
            }
            if (dir == 3) {
                if (row == minRow) {
                    dir = 0;
                    col++;
                } else {
                    row--;
                }
            }
        }
        return res;
    }
}