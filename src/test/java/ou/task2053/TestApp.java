package ou.task2053;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        String[] arr = {"d","b","c","b","c","a"};
        int k = 2;

        assertEquals("a", solution.kthDistinct(arr, k));
    }

    @Test
    public void test_2() {
        String[] arr = {"aaa","aa","a"};
        int k = 1;

        assertEquals("aaa", solution.kthDistinct(arr, k));
    }

    @Test
    public void test_3() {
        String[] arr = {"a","b","a"};
        int k = 3;

        assertEquals("", solution.kthDistinct(arr, k));
    }
}
