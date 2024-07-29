package ou.task783;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Solution {
    List<Integer> values = new ArrayList<>();

    public int minDiffInBST(TreeNode root) {
        dfs(root);
        Collections.sort(values);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < values.size() - 1; i++) {
            int current = values.get(i);
            int next = values.get(i + 1);
            if (Math.abs(current - next) < min)
                min = Math.abs(current - next);
        }
        return min;
    }

    private void dfs(TreeNode treeNode) {
        if (treeNode == null)
            return;
        values.add(treeNode.val);
        dfs(treeNode.left);
        dfs(treeNode.right);
    }
}
