package ou.task860;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n5 = 0, n10 = 0;
        for (int bill : bills) {
            if (bill == 5)
                n5++;
            if (bill == 10) {
                n5--;
                if (n5 < 0)
                    return false;
                n10++;
            }
            if (bill == 20) {
                if (n10 > 0) {
                    n10--;
                    n5--;
                } else
                    n5 -= 3;
                if (n5 < 0 || n10 < 0)
                    return false;
            }
        }
        return true;
    }
}
