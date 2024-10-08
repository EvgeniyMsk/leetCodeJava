package ou.task231;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        assertTrue(solution.isPowerOfTwo(1));
    }

    @Test
    public void test_2() {
        assertTrue(solution.isPowerOfTwo(16));
    }

    @Test
    public void test_3() {
        assertFalse(solution.isPowerOfTwo(3));
    }

    @Test
    public void test_4() {
        assertFalse(solution.isPowerOfTwo(15));
    }
}
