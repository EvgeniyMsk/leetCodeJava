package ou.task2231;

public class Solution {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null)
            return root.val == 1;
        if (root.left == null || root.right == null)
            return false;
        if (root.val == 2)
            return evaluateTree(root.left) || evaluateTree(root.right);
        else
            return evaluateTree(root.left) && evaluateTree(root.right);
    }
}
