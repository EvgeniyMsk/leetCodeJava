package ou.task69;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        assertEquals(solution.mySqrt(4), 2);
    }

    @Test
    public void test_2() {
        assertEquals(solution.mySqrt(8), 2);
    }
}
