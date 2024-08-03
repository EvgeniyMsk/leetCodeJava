package ou.task1315;

public class Solution {
    int sumEven = 0;
    public int sumEvenGrandparent(TreeNode root) {
        dfs(root);
        return sumEven;
    }

    private void dfs(TreeNode treeNode) {
        if (treeNode == null)
            return;
        if (treeNode.val % 2 == 0)
            sumEven += getChildrenSum(treeNode);
        dfs(treeNode.left);
        dfs(treeNode.right);
    }

    private int getChildrenSum(TreeNode treeNode) {
        if (!isGrand(treeNode))
            return 0;
        int result = 0;
        result += getChildSum(treeNode.left) + getChildSum(treeNode.right);
        return result;
    }

    private int getChildSum(TreeNode treeNode) {
        if (!hasChild(treeNode))
            return 0;
        if (treeNode.right == null)
            return treeNode.left.val;
        if (treeNode.left == null)
            return treeNode.right.val;
        return (treeNode.right.val + treeNode.left.val);
    }

    private boolean isGrand(TreeNode treeNode) {
        if (treeNode != null)
            return (hasChild(treeNode) && (hasChild(treeNode.left) || hasChild(treeNode.right)));
        return false;
    }

    private boolean hasChild(TreeNode treeNode) {
        if (treeNode != null)
            return (treeNode.left != null || treeNode.right != null);
        return false;
    }
}
