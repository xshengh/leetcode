public class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        row.add(1);
        for (int j = 1; j <= rowIndex; j++) {
            int first = row.get(0);
            row.set(0, 1);
            for (int i = 1; i < row.size(); i++) {
                int second = row.get(i);
                row.set(i, first+second);
                first = second;
            }
            row.add(1);
        }
        return row;
    }
}
