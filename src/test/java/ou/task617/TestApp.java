package ou.task617;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.left.right = new TreeNode(4);
        root2.right = new TreeNode(3);
        root2.right.right = new TreeNode(7);

        TreeNode mergedTreeNode = new TreeNode(3);
        mergedTreeNode.left = new TreeNode(4);
        mergedTreeNode.left.left = new TreeNode(5);
        mergedTreeNode.left.right = new TreeNode(4);
        mergedTreeNode.right = new TreeNode(5);
        mergedTreeNode.right.right = new TreeNode(7);

        assertTrue(solution.isSameTree(solution.mergeTrees(root1, root2), mergedTreeNode));
    }

    @Test
    public void test_2() {
        TreeNode root1 = new TreeNode(1);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);

        TreeNode mergedTreeNode = new TreeNode(2);
        mergedTreeNode.left = new TreeNode(2);

        assertTrue(solution.isSameTree(solution.mergeTrees(root1, root2), mergedTreeNode));
    }
}
