package ou.task1701;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();


    @Test
    public void test_1() {
        int[][] customers = {{ 1, 2 }, { 2, 5 }, { 4, 3}};
        assertEquals(solution.averageWaitingTime(customers), 5.0000);
    }


    @Test
    public void test_2() {
        int[][] customers = {{ 5, 2 }, { 5, 4 }, { 10, 3 }, { 20, 1 }};
        assertEquals(solution.averageWaitingTime(customers), 3.2500);
    }
}
