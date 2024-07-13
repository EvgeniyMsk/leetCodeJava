package ou.task2751;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestApp {
    private static final Solution solution = new Solution();

    @Test
    public void test_1() {
        int[] positions = { 5, 4, 3, 2, 1 };
        int[] healths = { 2, 17, 9, 15, 10 };
        String directions = "RRRRR";

        List<Integer> resultList = solution.survivedRobotsHealths(positions, healths, directions);
        int[] expectedResult = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++)
            expectedResult[i] = resultList.get(i);
        assertArrayEquals(expectedResult, new int[]{2, 17, 9, 15, 10});;
    }

    @Test
    public void test_2() {
        int[] positions = { 3,5,2,6 };
        int[] healths = { 10,10,15,12 };
        String directions = "RLRL";

        List<Integer> resultList = solution.survivedRobotsHealths(positions, healths, directions);
        int[] expectedResult = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++)
            expectedResult[i] = resultList.get(i);
        assertArrayEquals(expectedResult, new int[]{14});
    }

    @Test
    public void test_3() {
        int[] positions = { 1,2,5,6 };
        int[] healths = { 10,10,11,11 };
        String directions = "RLRL";

        List<Integer> resultList = solution.survivedRobotsHealths(positions, healths, directions);
        int[] expectedResult = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++)
            expectedResult[i] = resultList.get(i);
        assertArrayEquals(expectedResult, new int[]{});
    }
}
