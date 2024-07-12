package ou.task3079;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        int[] nums = {1, 2, 3};
        assertEquals(6, solution.sumOfEncryptedInt(nums));
    }

    @Test
    public void test_2() {
        int[] nums = {10, 21, 31};
        assertEquals(66, solution.sumOfEncryptedInt(nums));
    }

    @Test
    public void test_3() {
        int[] nums = {
                776,
                858,
                33,
                969,
                1000,
                968};
        assertEquals(4807, solution.sumOfEncryptedInt(nums));
    }
}
