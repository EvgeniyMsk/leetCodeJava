package ou.task144;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> path = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        dfs(root);
        return path;
    }

    public void dfs(TreeNode treeNode) {
        if (treeNode == null)
            return;
        path.add(treeNode.val);
        dfs(treeNode.left);
        dfs(treeNode.right);
    }
}
