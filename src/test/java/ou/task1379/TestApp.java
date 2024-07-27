package ou.task1379;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode original = new TreeNode(7);
        original.left = new TreeNode(4);
        original.right = new TreeNode(3);
        original.right.left = new TreeNode(6);
        original.right.right = new TreeNode(19);

        TreeNode cloned = new TreeNode();
        cloned.left = new TreeNode(4);
        cloned.right = new TreeNode(3);
        cloned.right.left = new TreeNode(6);
        cloned.right.right = new TreeNode(19);
        TreeNode target = original.right;
        assertEquals(solution.getTargetCopy(original, cloned, target).val, cloned.right.val);
    }

    @Test
    public void test_2() {
        TreeNode original = new TreeNode(8);
        original.right = new TreeNode(6);
        original.right.right = new TreeNode(5);
        original.right.right.right = new TreeNode(4);
        original.right.right.right.right = new TreeNode(3);
        original.right.right.right.right.right = new TreeNode(2);
        original.right.right.right.right.right.right = new TreeNode(1);


        TreeNode cloned = new TreeNode();
        cloned.right = new TreeNode(6);
        cloned.right.right = new TreeNode(5);
        cloned.right.right.right = new TreeNode(4);
        cloned.right.right.right.right = new TreeNode(3);
        cloned.right.right.right.right.right = new TreeNode(2);
        cloned.right.right.right.right.right.right = new TreeNode(1);

        TreeNode target = original.right.right.right;
        assertEquals(solution.getTargetCopy(original, cloned, target).val, cloned.right.right.right.val);
    }
}
