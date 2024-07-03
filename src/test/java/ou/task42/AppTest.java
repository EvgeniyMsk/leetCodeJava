package ou.task42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    Solution solution = new Solution();
    @Test
    public void test1() {
        int[] nums = { 0,1,0,2,1,0,1,3,2,1,2,1 };
        assertEquals(solution.trap(nums), 6);
    }

    @Test
    public void test2() {
        int[] nums = { 4,2,0,3,2,5 };
        assertEquals(solution.trap(nums), 9);
    }
}
