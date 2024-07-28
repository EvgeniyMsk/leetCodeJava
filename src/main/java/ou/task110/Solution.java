package ou.task110;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return true;
        if (root.left == null)
            return Math.abs(maxDepth(root.right)) <= 1;
        else if (root.right == null)
            return Math.abs(maxDepth(root.left)) <= 1;
        return isBalanced(root.left) && isBalanced(root.right) &&
                Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1;
    }

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int maxDepthLeft = maxDepth(root.left);
        int maxDepthRight = maxDepth(root.right);
        return Math.max(maxDepthLeft, maxDepthRight) + 1;
    }
}
