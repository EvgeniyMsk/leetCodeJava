package ou.task559;

public class Solution {
    int maxLevel = 0;
    public int maxDepth(Node root) {
        if (root == null)
            return 0;
        dfs(root, 0);
        return maxLevel + 1;
    }

    public void dfs(Node node, int level) {
        if (node == null)
            return;
        if (maxLevel < level)
            maxLevel = level;
        if (node.children != null) {
            for (Node n : node.children)
                dfs(n, level + 1);
        }
    }
}
