package ou.task2392;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        int k = 3;
        int[][] rowConditions = {{ 1, 2 },{ 3, 2 }};
        int[][] colConditions = {{ 2, 1 },{ 3, 2 }};
        assertArrayEquals(solution.buildMatrix(k, rowConditions, colConditions)[0], new int[]{3, 0, 0});
        assertArrayEquals(solution.buildMatrix(k, rowConditions, colConditions)[1], new int[]{0, 0, 1});
        assertArrayEquals(solution.buildMatrix(k, rowConditions, colConditions)[2], new int[]{0, 2, 0});
    }

    @Test
    public void test_2() {
        int k = 3;
        int[][] rowConditions = {{ 1, 2 }, { 2, 3 }, { 3, 1 }, { 2, 3 }};
        int[][] colConditions = {{ 2, 1 }};
        assertEquals(0, solution.buildMatrix(k, rowConditions, colConditions).length);
    }
}
