package ou.task671;

import java.util.TreeSet;

public class Solution {
    TreeSet<Integer> values = new TreeSet<>();

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null)
            return -1;
        dfs(root);
        values.pollFirst();

        if (!values.isEmpty())
            return values.pollFirst();
        return -1;
    }

    private void dfs(TreeNode treenode) {
        if (treenode == null)
            return;
        values.add(treenode.val);
        dfs(treenode.left);
        dfs(treenode.right);
    }
}
