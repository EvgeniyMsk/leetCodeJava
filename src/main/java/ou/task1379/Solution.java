package ou.task1379;

public class Solution {
    TreeNode answer;
    TreeNode target;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        this.target = target;
        dfs(original, cloned);
        return answer;
    }

    public void dfs(TreeNode src, TreeNode dst) {
        if (src != null) {
            this.dfs(src.left, dst.left);
            if (src == target)
                this.answer = dst;
            this.dfs(src.right, dst.right);
        }
    }
}
