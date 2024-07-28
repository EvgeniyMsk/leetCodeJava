package ou.task897;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);


        TreeNode expectedTree = new TreeNode(1);
        expectedTree.right = new TreeNode(2);
        expectedTree.right.right = new TreeNode(3);
        expectedTree.right.right.right = new TreeNode(4);
        expectedTree.right.right.right.right = new TreeNode(5);
        expectedTree.right.right.right.right.right = new TreeNode(6);
        expectedTree.right.right.right.right.right.right = new TreeNode(7);
        expectedTree.right.right.right.right.right.right.right = new TreeNode(8);
        expectedTree.right.right.right.right.right.right.right.right = new TreeNode(9);

        assertTrue(solution.isSameTree(solution.increasingBST(root), expectedTree));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(7);

        TreeNode expectedTree = new TreeNode(1);
        expectedTree.right = new TreeNode(5);
        expectedTree.right.right = new TreeNode(7);

        assertTrue(solution.isSameTree(solution.increasingBST(root), expectedTree));
    }
}
