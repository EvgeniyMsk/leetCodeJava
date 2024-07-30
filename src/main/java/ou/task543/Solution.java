package ou.task543;

public class Solution {
    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return diameter - 1;
    }

    public int dfs(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }
        int left = dfs(treeNode.left);
        int right = dfs(treeNode.right);
        int currentDiameter = left + right + 1;
        diameter = Math.max(diameter, currentDiameter);
        return Math.max(left, right) + 1;
    }
}
