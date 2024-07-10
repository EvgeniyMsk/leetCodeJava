package ou.task1598;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        assertEquals(solution.minOperations(new String[]{ "d1/", "d2/", "../", "d21/", "./" }), 2);
    }

    @Test
    public void test_2() {
        assertEquals(solution.minOperations(new String[]{ "d1/", "d2/", "./", "d3/", "../", "d31/" }), 3);
    }

    @Test
    public void test_3() {
        assertEquals(solution.minOperations(new String[]{ "d1/", "../", "../", "../" }), 0);
    }
}
