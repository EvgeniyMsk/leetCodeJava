package ou.task42;


public class Solution {
    public int trap(int[] height) {
        int size = height.length;
        if (size == 0)
            return 0;
        int result = 0;
        int[] l_max = new int[size];
        int[] r_max = new int[size];
        l_max[0] = height[0];
        for (int i = 1; i < size; i++)
            l_max[i] = Math.max(l_max[i - 1], height[i]);
        l_max[size - 1] = height[size - 1];
        r_max[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--)
            r_max[i] = Math.max(r_max[i + 1], height[i]);
        for (int i = 0; i < size - 1; i++)
            result += Math.min(l_max[i], r_max[i]) - height[i];
        return result;
    }
}
