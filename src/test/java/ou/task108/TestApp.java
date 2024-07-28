package ou.task108;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        int[] nums = { -10, -3, 0, 5, 9 };

        TreeNode expected1 = new TreeNode(0);
        expected1.left = new TreeNode(-3);
        expected1.left.left = new TreeNode(-10);
        expected1.right = new TreeNode(9);
        expected1.right.left = new TreeNode(5);

        TreeNode expected2 = new TreeNode(0);
        expected2.left = new TreeNode(-10);
        expected2.left.right = new TreeNode(-3);
        expected2.right = new TreeNode(5);
        expected2.right.right = new TreeNode(9);

        assertTrue(solution.isSameTree(solution.sortedArrayToBST(nums), expected1) ||
                solution.isSameTree(solution.sortedArrayToBST(nums), expected2));
    }

    @Test
    public void test_2() {
        int[] nums = { 1, 3 };

        TreeNode expected1 = new TreeNode(3);
        expected1.left = new TreeNode(1);

        TreeNode expected2 = new TreeNode(1);
        expected2.right = new TreeNode(3);

        assertTrue(solution.isSameTree(solution.sortedArrayToBST(nums), expected1) ||
                solution.isSameTree(solution.sortedArrayToBST(nums), expected2));
    }
}
