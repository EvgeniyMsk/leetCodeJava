package ou.task94;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null));
        List<Integer> root = new ArrayList<>() {
            {
                add(1);
                add(3);
                add(2);
            }
        };
        assertEquals(root, solution.inorderTraversal(treeNode));
    }

    @Test
    public void test_2() {
        TreeNode treeNode = null;
        List<Integer> root = new ArrayList<>() {};
        assertEquals(root, solution.inorderTraversal(treeNode));
    }

    @Test
    public void test_3() {
        TreeNode treeNode = new TreeNode(1);
        List<Integer> root = new ArrayList<>() {
            {
                add(1);
            }
        };
        assertEquals(root, solution.inorderTraversal(treeNode));
    }
}
