package ou.task509;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        assertEquals(1, solution.fib(2));
    }

    @Test
    public void test_2() {
        assertEquals(2, solution.fib(3));
    }

    @Test
    public void test_3() {
        assertEquals(3, solution.fib(4));
    }
}
