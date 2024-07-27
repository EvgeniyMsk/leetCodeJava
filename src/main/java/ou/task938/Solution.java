package ou.task938;

public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;
        int result = 0;
        if (root.val >= low && root.val <= high)
            result += root.val;
        return result +
                rangeSumBST(root.right, low, high) +
                rangeSumBST(root.left, low, high);
    }
}
