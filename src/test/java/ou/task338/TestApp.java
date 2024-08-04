package ou.task338;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        assertArrayEquals(new int[] { 0, 1, 1 }, solution.countBits(2));
    }

    @Test
    public void test_2() {
        assertArrayEquals(new int[] { 0, 1, 1, 2, 1, 2 }, solution.countBits(5));
    }
}
