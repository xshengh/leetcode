public class Solution {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int n1 = 1;
        int n2 = 2;
        int result = 0;
        for (int i = 0; i < n-2; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }
        return result;
    }
}
