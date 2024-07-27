package ou.task2236;

public class Solution {
    public boolean checkTree(TreeNode root) {
        if (root.left == null && root.right == null)
            return true;
        if (root.left == null || root.right == null)
            return false;
        return (root.val == root.left.val + root.right.val) &&
                checkTree(root.left) &&
                checkTree(root.right);
    }
}
