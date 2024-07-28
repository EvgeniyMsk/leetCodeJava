package ou.task872;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    List<Integer> leafs1 = new ArrayList<>();
    List<Integer> leafs2 = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        dfs(root1, leafs1);
        dfs(root2, leafs2);
        return leafs1.equals(leafs2);
    }

    public void dfs(TreeNode treeNode, List<Integer> leafs) {
        if (treeNode == null)
            return;
        if (treeNode.left == null && treeNode.right == null)
            leafs.add(treeNode.val);
        dfs(treeNode.left, leafs);
        dfs(treeNode.right, leafs);
    }
}
