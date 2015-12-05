/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> rows = new ArrayList<List<Integer>>();
        if (root != null) {
            List<TreeNode> levelNum = new ArrayList<TreeNode>();
            List<Integer> nodeRow = new ArrayList<Integer>();
            levelNum.add(root);
            int childSize = 0;
            int parentSize = 1;
            while(!levelNum.isEmpty()) {
                TreeNode node = levelNum.get(0);
                nodeRow.add(node.val);
                if (node.left != null) {
                    levelNum.add(node.left);
                    childSize++;
                }
                if (node.right != null) {
                    levelNum.add(node.right);
                    childSize++;
                }
                parentSize--;
                if (parentSize == 0) {
                    rows.add(nodeRow);
                    nodeRow = new ArrayList<Integer>();
                    parentSize = childSize;
                    childSize = 0;
                }
                levelNum.remove(0);
            }
        }
        return rows;
    }
}
