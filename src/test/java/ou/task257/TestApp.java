package ou.task257;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);

        List<String> expectedPaths1 = new ArrayList<>() {
            {
                add("1->2->5");
                add("1->3");
            }
        };
        List<String> expectedPaths2 = new ArrayList<>() {
            {
                add("1->3");
                add("1->2->5");
            }
        };
        assertTrue(expectedPaths1.equals(solution.binaryTreePaths(root)) ||
                expectedPaths2.equals(solution.binaryTreePaths(root)));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(1);
        List<String> expectedPaths = new ArrayList<>() {
            {
                add("1");
            }
        };
        assertEquals(expectedPaths, solution.binaryTreePaths(root));
    }
}
