package ou.task653;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer, Integer> numbers = new HashMap<>();

    public boolean findTarget(TreeNode root, int k) {
        dfs(root, k);
        for (int i : numbers.keySet()) {
            if (numbers.get(i) != null &&
                    numbers.get(numbers.get(i)) != null &&
                    numbers.get(i) != i) {
                return true;
            }
        }
        return false;
    }

    private void dfs(TreeNode treeNode, int val) {
        if (treeNode == null) {
            return;
        }
        numbers.put(treeNode.val, val - treeNode.val);
        dfs(treeNode.left, val);
        dfs(treeNode.right, val);
    }
}
