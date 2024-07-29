package ou.task110;

public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return false;
        return isBalanced(root.left) &&
                isBalanced(root.right) &&
                (root.val < root.left.val) && (root.val > root.right.val);
    }
}
