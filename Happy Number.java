public class Solution {
    public boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }
        boolean[] visited = new boolean[1000];
        Arrays.fill(visited, false);
        int count;
        boolean first = false;
        do {
            if(!first) {
                first = true;
            } else {
                visited[n] = true;
            }
            count = 0;
            while(n != 0) {
                int tmp = n % 10;
                n /= 10;
                count += tmp * tmp;
            }
            if (count == 1) {
                return true;
            }
            n = count;
        }while(!visited[n]);
        return false;
    }
}
