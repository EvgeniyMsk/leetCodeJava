package ou.task3079;

public class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int result = 0;
        for (int x : nums)
            result += getMaxSum(x);
        return result;
    }

    private int getMaxDigit(int x) {
        int result = 0;
        while (x > 0) {
            if (x % 10 >= result) {
                result = x % 10;
            }
            x = x / 10;
        }
        return result;
    }

    private int getMaxSum(int x) {
        if (x < 10)
            return getMaxDigit(x);
        if (x <= 99)
            return 11 * getMaxDigit(x);
        if (x <= 999)
            return 111 * getMaxDigit(x);
        return 1111;
    }
}
