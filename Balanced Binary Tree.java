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
    boolean balanced = true;
    public boolean isBalanced(TreeNode root) {
        return dfs(root) == 0 ? true : balanced;
    }
    
    private int dfs(TreeNode root) {
        if (!balanced || root == null) {
            return 0;
        }
        int leftd = dfs(root.left) + 1;
        int rightd = dfs(root.right) + 1;
        if (leftd - rightd > 1 || leftd - rightd < -1) {
            balanced = false;
        }
        return leftd > rightd ? leftd : rightd;
    }
}
