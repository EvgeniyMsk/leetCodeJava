package ou.task637;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestApp {
    private final Solution solution = new Solution();

    @Test
    public void test_1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<Double> expectedList = new ArrayList<>() {
            {
                add(3.0);
                add(14.5);
                add(11.0);
            }
        };
        assertEquals(solution.averageOfLevels(root), expectedList);
    }

    @Test
    public void test_2() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(7);

        List<Double> expectedList = new ArrayList<>() {
            {
                add(3.0);
                add(14.5);
                add(11.0);
            }
        };
        assertEquals(solution.averageOfLevels(root), expectedList);
    }
}
