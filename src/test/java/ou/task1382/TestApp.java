package ou.task1382;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        TreeNode expected_1 = new TreeNode(2);
        expected_1.left = new TreeNode(1);
        expected_1.right = new TreeNode(3);
        expected_1.right.right = new TreeNode(4);

        TreeNode expected_2 = new TreeNode(3);
        expected_2.left = new TreeNode(1);
        expected_2.right = new TreeNode(4);
        expected_2.left.right = new TreeNode(2);

        assertTrue(isSameTree(solution.balanceBST(root), expected_1) ||
                isSameTree(solution.balanceBST(root), expected_2));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        TreeNode expected_1 = new TreeNode(2);
        expected_1.left = new TreeNode(1);
        expected_1.right = new TreeNode(3);

        assertTrue(isSameTree(solution.balanceBST(root), expected_1));
    }

    private boolean isSameTree(TreeNode treeNode1, TreeNode treeNode2) {
        if (treeNode1 == null && treeNode2 == null)
            return true;
        if (treeNode1 == null || treeNode2 == null)
            return false;
        return (treeNode1.val == treeNode2.val)
                && isSameTree(treeNode1.left, treeNode2.left)
                && isSameTree(treeNode1.right, treeNode2.right);
    }
}
