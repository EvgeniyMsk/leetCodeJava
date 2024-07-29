package ou.task404;

public class Solution {
    int count = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        dfs(root);
        return count;
    }

    public void dfs(TreeNode treeNode) {
        if (treeNode == null)
            return;
        if (treeNode.left != null &&
                treeNode.left.left == null &&
                treeNode.left.right == null)
            count += treeNode.left.val;
        dfs(treeNode.left);
        dfs(treeNode.right);
    }

}
