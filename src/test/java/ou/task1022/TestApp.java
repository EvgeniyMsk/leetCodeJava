package ou.task1022;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        ArrayList<Integer> paths = new ArrayList<>();
        paths.add(1);
        paths.add(1);
        paths.add(1);
        assertEquals(22, solution.sumRootToLeaf(root));
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(0);
        assertEquals(0, solution.sumRootToLeaf(root));
    }
}
