package ou.task404;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        assertEquals(24, solution.sumOfLeftLeaves(root));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(1);

        assertEquals(0, solution.sumOfLeftLeaves(root));
    }

    @Test
    public void test_3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        assertEquals(4, solution.sumOfLeftLeaves(root));
    }
}
