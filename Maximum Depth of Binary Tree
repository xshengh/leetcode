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
    int maxDepth = 0;
    
    public int maxDepth(TreeNode root) {
        dfs(root, 0);
        return maxDepth;
    }
    
    public void dfs(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        depth++;
        if (maxDepth < depth) {
            maxDepth = depth;
        }
        dfs(root.left, depth);
        dfs(root.right, depth);
    }
}
