package ou.task111;

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int minDepthLeft = minDepth(root.left);
        int minDepthRight = minDepth(root.right);
        if (root.left == null && root.right == null)
            return 1;
        if (root.left == null)
            return minDepthRight + 1;
        if (root.right == null)
            return minDepthLeft + 1;
        return Math.min(minDepthLeft, minDepthRight) + 1;
    }
}
