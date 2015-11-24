public class Solution {
    public int[] plusOne(int[] digits) {
        boolean flag = true;
        for (int i = digits.length-1; i >= 0; i--) {
            int sum = digits[i] + (flag ? 1 : 0);
            flag = sum >= 10 ? true : false;
            digits[i] = sum % 10;
        }
        if (flag) {
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            for(int i = 1; i < ans.length; i++) {
                ans[i] = digits[i-1];
            }
            return ans;
        }
        return digits;
    }
}
