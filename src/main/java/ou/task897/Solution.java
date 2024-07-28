package ou.task897;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    ArrayList<Integer> digits = new ArrayList<>();

    public TreeNode increasingBST(TreeNode root) {
        if (root == null)
            return null;
        dfs(root);
        Collections.sort(digits);
        TreeNode treeNode = new TreeNode();
        TreeNode result = treeNode;
        for (int i = 0; i < digits.size(); i++) {
            treeNode.val = digits.get(i);
            if (i != digits.size() - 1) {
                treeNode.right = new TreeNode();
                treeNode = treeNode.right;
            }
        }
        return result;
    }

    private void dfs(TreeNode root) {
        if (root == null)
            return;
        digits.add(root.val);
        dfs(root.left);
        dfs(root.right);
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
