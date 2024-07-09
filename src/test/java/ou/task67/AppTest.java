package ou.task67;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        assertEquals(solution.addBinary("11", "1"), "100");
    }

    @Test
    public void test_2() {
        assertEquals(solution.addBinary("1010", "1011"), "10101");
    }
}
