package ou.task993;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);

        assertFalse(solution.isCousins(root, 3, 4));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(5);

        assertTrue(solution.isCousins(root, 5, 4));
    }

    @Test
    public void test_3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);

        assertFalse(solution.isCousins(root, 2, 3));
    }
}
