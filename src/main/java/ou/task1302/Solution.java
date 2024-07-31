package ou.task1302;

import java.util.TreeMap;

public class Solution {
    TreeMap<Integer, Integer> levelSum = new TreeMap<>();

    public int deepestLeavesSum(TreeNode root) {
        if (root == null)
            return 0;
        dfs(root, 0);
        if (levelSum.isEmpty())
            return 0;
        return levelSum.get(levelSum.lastKey());
    }

    private void dfs(TreeNode treeNode, int level) {
        if (treeNode == null)
            return;
        levelSum.computeIfPresent(level, (k, v) -> v + treeNode.val);
        levelSum.computeIfAbsent(level, k -> treeNode.val);
        dfs(treeNode.left, level + 1);
        dfs(treeNode.right, level + 1);
    }
}
