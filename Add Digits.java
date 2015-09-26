public class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return num;
        }
        int[] mod = new int[9];
        mod[0] = 9;
        for (int i = 1; i < 9; ++i) {
            mod[i] = i;
        }
        return mod[num%9];
    }
}
