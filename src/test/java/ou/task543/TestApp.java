package ou.task543;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        assertEquals(3, solution.diameterOfBinaryTree(root));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        assertEquals(1, solution.diameterOfBinaryTree(root));
    }
}
