package ou.task501;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);

        int[] expected = new int[]{ 2 };
        assertArrayEquals(expected, solution.findMode(root));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(0);

        int[] expected = new int[]{ 0 };
        assertArrayEquals(expected, solution.findMode(root));
    }
}
