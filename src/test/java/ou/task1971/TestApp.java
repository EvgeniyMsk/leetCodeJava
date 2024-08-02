package ou.task1971;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        int n = 3;
        int[][] edges = {
                {0, 1},
                {1, 2},
                {2, 0},
        };
        int source = 0;
        int dest = 2;

        assertTrue(solution.validPath(n, edges, source, dest));
    }

    @Test
    public void test_2() {
        int n = 6;
        int[][] edges = {
                {0, 1},
                {0, 2},
                {3, 5},
                {5, 4},
                {4, 3}
        };
        int source = 0;
        int dest = 5;

        assertFalse(solution.validPath(n, edges, source, dest));
    }

    @Test
    public void test_3() {
        int n = 10;
        int[][] edges = {
                { 4, 3 },
                { 1, 4 },
                { 4, 8 },
                { 1, 7 },
                { 6, 4 },
                { 4, 2 },
                { 7, 4 },
                { 4, 0 },
                { 0, 9 },
                { 5, 4 }
        };
        int source = 5;
        int dest = 9;

        assertTrue(solution.validPath(n, edges, source, dest));
    }

    @Test
    public void test_4() {
        int n = 1;
        int[][] edges = {
        };
        int source = 0;
        int dest = 0;

        assertTrue(solution.validPath(n, edges, source, dest));
    }
}
