package ou.task2096;

public class Solution {
    public boolean getPath(TreeNode root, int val, StringBuilder result) {
        if (root.val == val)
            return true;
        if (root.left != null && getPath(root.left, val, result))
            result.append("L");
        else if (root.right != null && getPath(root.right, val, result))
            result.append("R");
        return result.length() > 0;
    }

    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder startBuild = new StringBuilder();
        StringBuilder destBuild = new StringBuilder();

        getPath(root, startValue, startBuild);
        getPath(root, destValue, destBuild);

        int i = 0;
        int max_i = Math.min(destBuild.length(), startBuild.length());
        while (i < max_i && startBuild.charAt(startBuild.length() - i - 1) == destBuild.charAt(destBuild.length() - i - 1))
            ++i;
        return "U".repeat(startBuild.length() - i) + destBuild.reverse().substring(i);
    }
}
