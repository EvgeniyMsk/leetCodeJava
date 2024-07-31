package ou.task1038;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.left.right.right = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(8);

        TreeNode expected = new TreeNode(30);
        expected.left = new TreeNode(36);
        expected.left.left = new TreeNode(36);
        expected.left.right = new TreeNode(35);
        expected.left.right.right = new TreeNode(33);
        expected.right = new TreeNode(21);
        expected.right.left = new TreeNode(26);
        expected.right.right = new TreeNode(15);
        expected.right.right.right = new TreeNode(8);

        assertTrue(isSameTree(expected, solution.bstToGst(root)));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(0);
        root.right = new TreeNode(1);


        TreeNode expected = new TreeNode(1);
        expected.right = new TreeNode(1);

        assertTrue(isSameTree(expected, solution.bstToGst(root)));
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        return (p.val == q.val) &&
                isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }
}
