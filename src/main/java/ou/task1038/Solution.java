package ou.task1038;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    TreeSet<Integer> values = new TreeSet<>();
    Map<Integer, Integer> sumMap = new TreeMap<>();

    public TreeNode bstToGst(TreeNode root) {
        if (root == null)
            return null;
        dfs(root);
        calcSum();
        dfs_convert(root);
        return root;
    }

    private void dfs_convert(TreeNode root) {
        if (root == null)
            return;
        root.val = sumMap.get(root.val);
        dfs_convert(root.left);
        dfs_convert(root.right);
    }

    private void dfs(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        values.add(treeNode.val);
        dfs(treeNode.left);
        dfs(treeNode.right);
    }

    private void calcSum() {
        for (int i : values) {
            int count = i;
            for (int j : values)
                if (j > i)
                    count += j;
            sumMap.put(i, count);
        }
    }
}
