package ou.task993;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer, Integer> nodesMap = new HashMap<>();
    Map<Integer, Integer> parentMap = new HashMap<>();

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root,null, 0);
        return (nodesMap.get(x) - nodesMap.get(y) == 0 && (
                parentMap.get(x) - parentMap.get(y) != 0));
    }

    public void dfs(TreeNode treeNode, TreeNode parent, int level) {
        if (treeNode == null)
            return;
        nodesMap.put(treeNode.val, level);
        if (parent == null)
            parentMap.put(treeNode.val, -1);
        else
            parentMap.put(treeNode.val, parent.val);
        dfs(treeNode.left, treeNode, level + 1);
        dfs(treeNode.right, treeNode, level + 1);
    }
}
