package ou.task572;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<TreeNode> nodes = new ArrayList<>();

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null)
            return true;
        if (root == null || subRoot == null)
            return false;
        dfs(root);
        for (TreeNode treeNode : nodes) {
            if (isSameTree(treeNode, subRoot))
                return true;
        }
        return false;
    }

    public void dfs(TreeNode treeNode) {
        if (treeNode == null)
            return;
        nodes.add(treeNode);
        dfs(treeNode.left);
        dfs(treeNode.right);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        return (p.val == q.val) &&
                isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }
}
