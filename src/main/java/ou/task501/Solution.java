package ou.task501;

import java.util.*;

public class Solution {
    TreeMap<Integer, Integer> counts = new TreeMap<>();
    int maxValue = Integer.MIN_VALUE;

    public int[] findMode(TreeNode root) {
        dfs(root);
        System.out.println(counts);
        Set<Integer> keys = new TreeSet<>();
        for (int key : counts.keySet()) {
            if (counts.get(key) - maxValue == 0) {
                keys.add(key);
            }
        }
        return keys.stream().mapToInt(i -> i).toArray();
    }

    public void dfs(TreeNode treeNode) {
        if (treeNode == null)
            return;
        counts.put(treeNode.val, counts.getOrDefault(treeNode.val, 0) + 1);
        if (counts.get(treeNode.val) > maxValue) {
            maxValue = counts.get(treeNode.val);
        }
        dfs(treeNode.left);
        dfs(treeNode.right);
    }
}
