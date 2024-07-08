package ou.task59;

public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int cnt = 1;
        int[][] direction = {
                {0, 1},
                {1, 0},
                {0, -1},
                {-1, 0}
        };
        int d = 0;
        int row = 0;
        int col = 0;
        while (cnt <= n * n) {
            result[row][col] = cnt++;
            int r = Math.floorMod(row + direction[d][0], n);
            int c = Math.floorMod(col + direction[d][1], n);

            if (result[r][c] != 0) d = (d + 1) % 4;

            row += direction[d][0];
            col += direction[d][1];
        }
        return result;
    }
}
