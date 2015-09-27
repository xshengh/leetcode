public class Solution {
    public void moveZeroes(int[] nums) {
        int p = 0;
        while(p < nums.length) {
            if (nums[p] == 0) {
                for (int i = p+1; i < nums.length; i++) {
                    if (nums[i] != 0) {
                        int tmp = nums[i];
                        nums[i] = nums[p];
                        nums[p] = tmp;
                        break;
                    }
                }
            }
            p++;
        }
    }
}
