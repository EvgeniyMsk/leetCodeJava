package ou.task222;

public class Solution {
    int count = 0;

    public int countNodes(TreeNode root) {
        dfs(root);
        return count;
    }

    public void dfs(TreeNode treeNode) {
        if (treeNode == null)
            return;
        count++;
        dfs(treeNode.left);
        dfs(treeNode.right);
    }
}
