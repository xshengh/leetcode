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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Deque<TreeNode> ps = new ArrayDeque<TreeNode>();
        Deque<TreeNode> qs = new ArrayDeque<TreeNode>();
        search(root, p, ps);
        search(root, q, qs);
        while(!ps.isEmpty()) {
            TreeNode ancestor = ps.pop();
            if (qs.contains(ancestor)) {
                return ancestor;
            }
        }
        return null;
    }
    private void search(TreeNode root, TreeNode p, Deque<TreeNode> stack) {
        if (root == null) {
            return;
        }
        stack.push(root);
        if (root == p) {
            return;
        }
        TreeNode tmp = p.val >= root.val ? root.right : root.left;
        search(tmp, p, stack);
    }
}
