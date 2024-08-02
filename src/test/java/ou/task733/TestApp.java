package ou.task733;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        int[][] image = {
                { 1, 1, 1 },
                { 1, 1, 0 },
                { 1, 0, 1 }
        };
        int sr = 1;
        int sc = 1;
        int color = 2;
        int[][] expectedImage = {
                { 2, 2, 2 },
                { 2, 2, 0 },
                { 2, 0, 1 }
        };
        assertArrayEquals(expectedImage, solution.floodFill(image, sr, sc, color));
    }

    @Test
    public void test_2() {
        int[][] image = {
                { 0, 0, 0 },
                { 0, 0, 0 }
        };
        int sr = 0;
        int sc = 0;
        int color = 0;
        int[][] expectedImage = {
                { 0, 0, 0 },
                { 0, 0, 0 }
        };
        assertArrayEquals(expectedImage, solution.floodFill(image, sr, sc, color));
    }

}
