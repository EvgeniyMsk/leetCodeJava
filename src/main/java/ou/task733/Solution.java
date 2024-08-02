package ou.task733;

public class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color)
            return image;
        dfs(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void dfs(int[][] image, int row, int col, int color, int newColor) {
        if (image[row][col] == color) {
            image[row][col] = newColor;
            if (row - 1 >= 0)
                dfs(image, row - 1, col, color, newColor);
            if (row + 1 < image.length)
                dfs(image, row + 1, col, color, newColor);
            if (col - 1 >= 0)
                dfs(image, row, col - 1, color, newColor);
            if (col + 1 < image[row].length)
                dfs(image, row, col + 1, color, newColor);
        }
    }
}
