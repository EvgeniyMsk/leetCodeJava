package ou.task1886;

import java.util.Arrays;

public class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        return Arrays.deepEquals(mat, target) ||
                Arrays.deepEquals(rotated90(mat), target) ||
                Arrays.deepEquals(rotated90(rotated90(mat)), target) ||
                Arrays.deepEquals(rotated90(rotated90(rotated90(mat))), target);
    }

    public int[][]rotated90(int[][] mat) {
        int n = mat.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = mat[j][n - i - 1];
            }
        }
        return result;
    }
}
