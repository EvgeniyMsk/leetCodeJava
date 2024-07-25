package ou.task231;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        if (n == 1)
            return true;
        return (Math.floor(Math.log10(n)/Math.log10(2)) - Math.ceil(Math.log10(n)/Math.log10(2))) == 0;
    }
}
