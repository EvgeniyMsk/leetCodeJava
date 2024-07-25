package ou.task104;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int maxDepthLeft = maxDepth(root.left);
        int maxDepthRight = maxDepth(root.right);
        return Math.max(maxDepthLeft, maxDepthRight) + 1;
    }
}
