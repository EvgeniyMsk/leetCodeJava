package ou.task1886;
import org.junit.jupiter.api.Test;
import ou.task1886.Solution;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        int[][] mat = {{0,1},{1,0}};
        int[][] target = {{1,0},{0,1}};

        assertEquals(solution.findRotation(mat, target), true);
    }

    @Test
    public void test_2() {
        int[][] mat = {{0,1},{1,1}};
        int[][] target = {{1,0},{0,1}};

        assertEquals(solution.findRotation(mat, target), false);
    }

    @Test
    public void test_3() {
        int[][] mat = {{0,0,0},{0,1,0}, {1,1,1}};
        int[][] target = {{1,1,1},{0,1,0}, {0,0,0}};

        assertEquals(solution.findRotation(mat, target), true);
    }
}
