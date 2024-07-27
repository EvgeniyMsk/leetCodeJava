package ou.task1022;

import java.util.*;

public class Solution {
    Map<TreeNode, List<Integer>> paths = new HashMap<>();

    public int sumRootToLeaf(TreeNode root) {
        makePaths(root, new ArrayList<>());
        int result = 0;
        for (TreeNode treeNode : paths.keySet()) {
            if (treeNode.left == null && treeNode.right == null) {
                result += getDecFromBinary(paths.get(treeNode));
            }
        }
        return result;
    }

    public void makePaths(TreeNode root, List<Integer> val) {
        if (root == null)
            return;
        List<Integer> vals = new ArrayList<>(val);
        vals.add(root.val);
        paths.put(root, vals);
        makePaths(root.left, vals);
        makePaths(root.right, vals);
    }

    public int getDecFromBinary(List<Integer> vals) {
        if (vals == null || vals.isEmpty())
            return 0;
        int result = 0;
        int pow = vals.size() - 1;
        for (int i : vals) {
            result += (int) Math.pow(2, pow) * i;
            pow--;
        }
        return result;
    }
}
