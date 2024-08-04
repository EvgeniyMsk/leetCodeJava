package ou.task338;

public class Solution {
    public int[] countBits(int n) {
        if (n == 0)
            return new int[] { 0 };
        if (n == 1)
            return new int[] { 0, 1 };
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++)
            if (i % 2 == 0) {
                result[i] = result[i / 2];
            } else {
                result[i] = result[i / 2] + 1;
            }
        return result;
    }
}
