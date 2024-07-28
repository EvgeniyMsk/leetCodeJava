package ou.task144;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> expectedList = new ArrayList<>() {
            {
                add(1);
                add(2);
                add(3);
            }
        };
        assertEquals(expectedList, solution.preorderTraversal(root));
    }

    @Test
    public void test_2() {
        TreeNode root = null;
        List<Integer> expectedList = new ArrayList<>();
        assertEquals(expectedList, solution.preorderTraversal(root));
    }

    @Test
    public void test_3() {
        TreeNode root = new TreeNode(1);
        List<Integer> expectedList = new ArrayList<>() {
            {
                add(1);
            }
        };
        assertEquals(expectedList, solution.preorderTraversal(root));
    }
}
