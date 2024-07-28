package ou.task222;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);

        assertEquals(6, solution.countNodes(root));
    }

    @Test
    public void test_2() {
        TreeNode root = null;

        assertEquals(0, solution.countNodes(root));
    }

    @Test
    public void test_3() {
        TreeNode root = new TreeNode(1);

        assertEquals(1, solution.countNodes(root));
    }
}
