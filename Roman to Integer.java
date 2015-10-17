public class Solution {
    public int romanToInt(String s) {
        int index = 0;
        int sum = 0;
        while(index < s.length()) {
            int num = getInt(s.charAt(index));
            int right;
            if (index < s.length()-1) {
                right = getInt(s.charAt(index+1));
            } else {
                right = 0;
            }
            if (num < right) {
                sum += (right-num);
                index += 2;
            } else {
                sum += num;
                index++;
            }
        }
        return sum;
    }
    
    private static int getInt(char s) {
        switch(s) {
            case 'I' :
                return 1;
            case 'V' :
                return 5;
            case 'X' :
                return 10;
            case 'L' :
                return 50;
            case 'C' :
                return 100;
            case 'D' :
                return 500;
            default :
                return 1000;
        }
    }
}
