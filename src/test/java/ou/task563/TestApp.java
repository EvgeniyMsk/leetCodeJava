package ou.task563;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        assertEquals(1, solution.findTilt(root));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(9);
        root.right.right = new TreeNode(7);

        assertEquals(15, solution.findTilt(root));
    }

    @Test
    public void test_3() {
        TreeNode root = new TreeNode(21);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(1);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(3);
        root.right = new TreeNode(14);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(2);

        assertEquals(9  , solution.findTilt(root));
    }
}
