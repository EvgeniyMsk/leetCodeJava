package ou.task101;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }


    public boolean isMirror(TreeNode tn1, TreeNode tn2) {
        if (tn1 == null && tn2 == null)
            return true;
        if (tn1 == null || tn2 == null)
            return false;
        return (tn1.val == tn2.val) &&
                isMirror(tn1.right, tn2.left) &&
                isMirror(tn1.left, tn2.right);
    }
}
