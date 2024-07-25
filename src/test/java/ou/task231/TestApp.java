package ou.task231;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        assertEquals(true, solution.isPowerOfTwo(1));
    }

    @Test
    public void test_2() {
        assertEquals(true, solution.isPowerOfTwo(16));
    }

    @Test
    public void test_3() {
        assertEquals(false, solution.isPowerOfTwo(3));
    }

    @Test
    public void test_4() {
        assertEquals(false, solution.isPowerOfTwo(15));
    }
}
