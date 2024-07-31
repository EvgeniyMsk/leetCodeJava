package ou.task463;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        int[][] grid = {
                { 0, 1, 0, 0 },
                { 1, 1, 1, 0 },
                { 0, 1, 0, 0 },
                { 1, 1, 0, 0 }
        };
        assertEquals(16, solution.islandPerimeter(grid));
    }

    @Test
    public void test_2() {
        int[][] grid = {
                { 1, 0 },
        };
        assertEquals(4, solution.islandPerimeter(grid));
    }

    @Test
    public void test_3() {
        int[][] grid = {
                { 1 },
        };
        assertEquals(4, solution.islandPerimeter(grid));
    }
}
