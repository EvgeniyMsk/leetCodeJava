package ou.task746;

public class Solution {
    int[] counts;
    public int minCostClimbingStairs(int[] cost) {
        if (cost.length < 2)
            return 0;
        if (cost.length == 2)
            return Math.min(cost[0], cost[1]);
        counts = new int[cost.length + 1];
        counts[0] = 0;
        counts[1] = 0;
        counts[2] = Math.min(cost[0], cost[1]);
        for (int i = 3; i < counts.length; i++) {
            counts[i] = Math.min(counts[i - 2] + cost[i - 2],
                    counts[i - 1] + cost[i - 1]);
        }
        return counts[cost.length];
    }
}
