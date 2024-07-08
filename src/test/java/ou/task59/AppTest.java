package ou.task59;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    private final Solution solution = new Solution();
    @Test
    public void test_1() {
        int[][] res = {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}};
        assertTrue(Arrays.deepEquals(res, solution.generateMatrix(3)));
    }

    @Test
    public void test_2() {
        int[][] res = {{1}};
        assertTrue(Arrays.deepEquals(res, solution.generateMatrix(1)));
    }
}
