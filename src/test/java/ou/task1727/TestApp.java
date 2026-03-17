package ou.task1727;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        int[][] customers = {{ 0, 0, 1 }, { 1, 1, 1 }, { 1, 0, 1}};
        assertEquals(solution.largestSubmatrix(customers), 4);
    }


    @Test
    public void test_2() {
        int[][] customers = {{ 1, 0, 1, 0, 1 } };
        assertEquals(solution.largestSubmatrix(customers), 3);
    }

    @Test
    public void test_3() {
        int[][] customers = {{ 1,1,0 }, { 1,0,1 } };
        assertEquals(solution.largestSubmatrix(customers), 2);
    }
}
