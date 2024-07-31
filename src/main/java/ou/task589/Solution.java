package ou.task589;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<Integer> path = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        dfs(root);
        return path;
    }

    public void dfs(Node root) {
        if (root == null)
            return;
        path.add(root.val);
        if (root.children != null)
        {
            for (Node child : root.children) {
                dfs(child);
            }
        }
    }
}
