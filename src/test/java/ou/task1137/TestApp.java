package ou.task1137;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        int n = 4;
        assertEquals(4, solution.tribonacci(n));
    }

    @Test
    public void test_2() {
        int n = 25;
        assertEquals(1389537, solution.tribonacci(n));
    }
}
