package ou.task746;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_0() {
        int[] cost = { 10, 15 };
        assertEquals(10, solution.minCostClimbingStairs(cost));
    }

    @Test
    public void test_1() {
        int[] cost = { 10, 15, 20 };
        assertEquals(15, solution.minCostClimbingStairs(cost));
    }

    @Test
    public void test_2() {
        int[] cost = { 1,100,1,1,1,100,1,1,100,1 };
        assertEquals(6, solution.minCostClimbingStairs(cost));
    }
}
