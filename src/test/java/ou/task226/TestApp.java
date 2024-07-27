package ou.task226;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode inverted = new TreeNode(4);
        inverted.left = new TreeNode(7);
        inverted.left.left = new TreeNode(9);
        inverted.left.right = new TreeNode(6);
        inverted.right = new TreeNode(2);
        inverted.right.left = new TreeNode(3);
        inverted.right.right = new TreeNode(1);

        assertTrue(solution.isSameTree(solution.invertTree(root), inverted));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        TreeNode inverted = new TreeNode(2);
        inverted.left = new TreeNode(3);
        inverted.right = new TreeNode(1);

        assertTrue(solution.isSameTree(solution.invertTree(root), inverted));
    }

    @Test
    public void test_3() {
        assertTrue(solution.isSameTree(solution.invertTree(null), null));
    }
}
