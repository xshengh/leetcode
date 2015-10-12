public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sArr = new int[60];
        Arrays.fill(sArr, 0);
        for(int i = 0; i < s.length(); i++) {
            int pos = s.charAt(i) - 'a';
            sArr[pos]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int pos = t.charAt(i) - 'a';
            sArr[30+pos]++;
        }
        for (int i = 0; i < 30; i++) {
            if (sArr[i] != sArr[i+30]) {
                return false;
            }
        }
        return true;
    }
}
