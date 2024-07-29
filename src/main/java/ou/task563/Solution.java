package ou.task563;

public class Solution {
    int sum = 0;

    public int findTilt(TreeNode root) {
        if (root == null)
            return 0;
        dfs(root);
        return sum;
    }

    private int dfs(TreeNode treeNode) {
        if (treeNode == null)
            return 0;
        int leftSum = dfs(treeNode.left);
        int rightSum = dfs(treeNode.right);
        sum += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + treeNode.val;
    }
}
