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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return dfs(root, 0, sum);
    }
    public boolean dfs(TreeNode root, int val, int sum) {
        if (root.left == null && root.right == null) {
            return val+root.val == sum;
        }
        if (root.left != null && dfs(root.left, val+root.val, sum)){
            return true;
        }
        if (root.right != null && dfs(root.right, val+root.val, sum)) {
            return true;
        }
        return false;
    }
}
