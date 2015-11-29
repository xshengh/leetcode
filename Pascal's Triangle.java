public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            if (i == 0) {
                row.add(1);
            } else {
                List<Integer> last = ans.get(ans.size()-1);
                row.add(1);
                for (int j = 0; j < last.size()-1; j++) {
                    row.add(last.get(j) + last.get(j+1));
                }
                row.add(1);
            }
            ans.add(row);
        }
        return ans;
    }
}
