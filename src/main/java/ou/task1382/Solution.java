package ou.task1382;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);
        return createBalancedBST(inorder, 0, inorder.size() - 1);
    }

    private TreeNode createBalancedBST(List<Integer> inorder,
                                       int start,
                                       int end) {
        if (start > end)
            return null;
        int mid = start + (end - start) / 2;
        TreeNode left = createBalancedBST(inorder, start, mid - 1);
        TreeNode right = createBalancedBST(inorder, mid + 1, end);
        return new TreeNode(inorder.get(mid), left, right);
    }

    private void inorderTraversal(TreeNode treeNode, List<Integer> inorder) {
        if (treeNode == null)
            return;
        inorderTraversal(treeNode.left, inorder);
        inorder.add(treeNode.val);
        inorderTraversal(treeNode.right, inorder);
    }
}
