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
    List<TreeNode> leftList = new ArrayList<TreeNode>();
    List<TreeNode> rightList = new ArrayList<TreeNode>();
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        leftList.add(root.left);
        rightList.add(root.right);
        while(!leftList.isEmpty() && !rightList.isEmpty()) {
            TreeNode left = leftList.remove(0);
            TreeNode right = rightList.remove(0);
            if (left == null && right == null) {
                continue;
            } else if (left != null && right != null && left.val == right.val) {
                leftList.add(left.left);
                leftList.add(left.right);
                rightList.add(right.right);
                rightList.add(right.left);
            } else {
                return false;
            }
        }
        return leftList.isEmpty() && rightList.isEmpty();
    }
}
