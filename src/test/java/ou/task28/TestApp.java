package ou.task28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
    }

    @Test
    public void test_2() {
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
    }
}
