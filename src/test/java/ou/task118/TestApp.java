package ou.task118;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        int numRows = 5;
        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(new ArrayList<>() { {
            add(1);
        }});
        expectedResult.add(new ArrayList<>() { {
            add(1);
            add(1);
        }});
        expectedResult.add(new ArrayList<>() { {
            add(1);
            add(2);
            add(1);
        }});
        expectedResult.add(new ArrayList<>() { {
            add(1);
            add(3);
            add(3);
            add(1);
        }});
        expectedResult.add(new ArrayList<>() { {
            add(1);
            add(4);
            add(6);
            add(4);
            add(1);
        }});
        assertEquals(expectedResult, solution.generate(numRows));
    }

    @Test
    public void test_2() {
        int numRows = 1;
        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(new ArrayList<>() { {
            add(1);
        }});
        assertEquals(expectedResult, solution.generate(numRows));
    }

    @Test
    public void test_3() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(1);
        System.out.println(solution.getNewRow(list));
    }

    @Test
    public void test_4() {
        System.out.println(solution.generate(10));
    }
}
