package ou.task108;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length - 1);
    }

    public TreeNode createBST(int[] nums, int l, int r) {
        if (l > r)
            return null;
        int mid = l + (r - l) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = createBST(nums, l, mid - 1);
        treeNode.right = createBST(nums, mid + 1, r);
        return treeNode;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;
        return (p.val == q.val) &&
                isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }
}
