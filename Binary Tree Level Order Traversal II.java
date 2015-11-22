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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelList = new ArrayList<List<Integer>> ();
        List<TreeNode> nodeList = new ArrayList<TreeNode>();
        if (root != null) {
            nodeList.add(root);
        }
        while(!nodeList.isEmpty()) {
            List<TreeNode> tmpList = new ArrayList<TreeNode>();
            List<Integer> valList = new ArrayList<Integer>();
            for(TreeNode node : nodeList) {
                valList.add(node.val);
                if (node.left != null) {
                    tmpList.add(node.left);
                }
                if (node.right != null) {
                    tmpList.add(node.right);
                }
            }
            levelList.add(0, valList);
            nodeList = tmpList;
        }
        return levelList;
    }
}
