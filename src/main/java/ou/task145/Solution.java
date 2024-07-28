package ou.task145;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    List<Integer> path = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null)
            return path;
        dfs(root);
        Collections.reverse(path);
        return path;
    }

    private void dfs(TreeNode treeNode) {
        if (treeNode == null)
            return;
        path.add(treeNode.val);
        dfs(treeNode.right);
        dfs(treeNode.left);
    }
}
