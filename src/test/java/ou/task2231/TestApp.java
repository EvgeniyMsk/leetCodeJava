package ou.task2231;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        assertTrue(solution.evaluateTree(root));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(0);
        assertFalse(solution.evaluateTree(root));
    }
}
