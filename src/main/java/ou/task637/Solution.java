package ou.task637;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    private final Map<Integer, Double> sumBylevel = new HashMap<>();
    private final Map<Integer, Integer> countByLevel = new HashMap<>();


    public List<Double> averageOfLevels(TreeNode root) {
        helper(root, 0);
        List<Double> result = new ArrayList<>();
        for (int i : sumBylevel.keySet())
            result.add(sumBylevel.get(i) / countByLevel.get(i));
        return result;
    }

    public void helper(TreeNode root, int level) {
        if (root == null)
            return;
        countByLevel.computeIfPresent(level, (k, v) -> countByLevel.get(level) + 1);
        countByLevel.putIfAbsent(level, 1);

        sumBylevel.computeIfPresent(level, (k, v) -> sumBylevel.get(level) + root.val);
        sumBylevel.computeIfAbsent(level, k -> (double) root.val);
        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }
}
