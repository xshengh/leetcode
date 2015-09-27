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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (!isSame(p, q)){
            return false;
        }
        if (p != null && q != null) {
            if (!isSameTree(p.left, q.left)) {
                return false;
            }
            if (!isSameTree(p.right, q.right)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean isSame(TreeNode p, TreeNode q) {
        return p == q || (p != null && q != null && q.val == p.val);
    }
}
