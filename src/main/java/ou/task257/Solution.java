package ou.task257;

import java.util.*;

public class Solution {
    Map<TreeNode, String> paths = new HashMap<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        dfs(root, "");
        List<String> result = new ArrayList<>();
        for (TreeNode treeNode : paths.keySet()) {
            if (treeNode.left == null && treeNode.right == null)
            {
                String path = paths.get(treeNode);
                if (path.startsWith("->"))
                    path = path.substring(2);
                if (path.endsWith("->"))
                    path = path.substring(0, path.length() - 2);
                result.add(path);
            }
        }
        return result;
    }

    public void dfs(TreeNode treeNode, String currentPath) {
        if (treeNode == null)
            return;
        if (treeNode.left == null && treeNode.right == null)
            if (currentPath.isEmpty())
            {
                paths.put(treeNode, currentPath + treeNode.val);
            } else
            {
                paths.put(treeNode, currentPath + "->" + treeNode.val);
            }

        paths.put(treeNode, currentPath + "->" + treeNode.val + "->");
        dfs(treeNode.left, currentPath + "->" + treeNode.val);
        dfs(treeNode.right, currentPath + "->" + treeNode.val);
    }
}
