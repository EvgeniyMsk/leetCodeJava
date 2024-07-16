package ou.task326;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        assertTrue(solution.isPowerOfThree(27));
    }

    @Test
    public void test_2() {
        assertFalse(solution.isPowerOfThree(0));
    }

    @Test
    public void test_3() {
        assertFalse(solution.isPowerOfThree(-1));
    }
}
