package ou.task145;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> expectedList = new ArrayList<>() {
            {
                add(3);
                add(2);
                add(1);
            }
        };
        assertEquals(solution.postorderTraversal(root), expectedList);
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(1);

        List<Integer> expectedList = new ArrayList<>() {
            {
                add(1);
            }
        };
        assertEquals(solution.postorderTraversal(root), expectedList);
    }

    @Test
    public void test_3() {
        TreeNode root = null;

        List<Integer> expectedList = new ArrayList<>();
        assertEquals(solution.postorderTraversal(root), expectedList);
    }
}
