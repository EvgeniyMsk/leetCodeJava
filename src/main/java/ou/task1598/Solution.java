package ou.task1598;

public class Solution {
    public int minOperations(String[] logs) {
        int level = 0;
        for (String log : logs) {
            switch (log) {
                case "../":
                { if (level > 0)
                    level--; break;
                }
                case "./": break;
                default: level++; break;
            }
        }
        return level;
    }
}
