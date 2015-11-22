public class Solution {
    public int removeDuplicates(int[] nums) {
        int pos = nums.length > 0 ? 1 : 0;
        int cur = nums.length > 0 ? nums[0] : 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != cur) {
                nums[pos++] = nums[i];
                cur = nums[i];
            }
        }
        return pos;
    }
}
