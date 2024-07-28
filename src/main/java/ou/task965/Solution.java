package ou.task965;

public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        if (root == null || (root.right == null && root.left == null))
            return true;
        if (root.left == null)
            return root.val == root.right.val && isUnivalTree(root.right);
        else if (root.right == null)
            return root.val == root.left.val && isUnivalTree(root.left);
        return (root.right.val == root.left.val && root.val == root.right.val)
                && isUnivalTree(root.left)
                && isUnivalTree(root.right);
    }
}
