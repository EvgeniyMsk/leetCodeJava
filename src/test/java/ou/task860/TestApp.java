package ou.task860;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        int[] bills = { 5, 5, 5, 10, 20 };
        assertTrue(solution.lemonadeChange(bills));
    }

    @Test
    public void test_2() {
        int[] bills = { 5, 5, 10, 10, 20 };
        assertFalse(solution.lemonadeChange(bills));
    }
}
