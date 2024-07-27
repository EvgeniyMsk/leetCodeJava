package ou.task700;

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

        int val = 2;

        TreeNode subTree = new TreeNode(2);
        subTree.left = new TreeNode(1);
        subTree.right = new TreeNode(3);

        assertTrue(solution.isSameTree(solution.searchBST(root, val), subTree));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);

        int val = 5;
        TreeNode subTree = null;
        assertTrue(solution.isSameTree(solution.searchBST(root, val), subTree));
    }
}
