public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int answer = -1;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }
            int tmp = map.get(nums[i]);
            map.put(nums[i], tmp+1);
            if (tmp+1 > maxCount) {
                answer = nums[i];
                maxCount = tmp+1;
            }
        }
        return answer;
    }
}
