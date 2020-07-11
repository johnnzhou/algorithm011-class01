/*
 * @lc app=leetcode id=236 lang=java
 *
 * [236] Lowest Common Ancestor of a Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode res = helper(p, q, root);

        return res;
        
    }

    private TreeNode helper(TreeNode p, TreeNode q, TreeNode ancestor) {
        // terminator
        if (ancestor == null || p == ancestor || q == ancestor) {
            return ancestor;
        }

        // drill down
        TreeNode left = helper(p, q, ancestor.left);
        TreeNode right = helper(p, q, ancestor.right);

        if (left != null && right != null) {
            return ancestor;
        } else if (left == null && right != null) {
            return right;
        } else if (left != null && right == null) {
            return left;
        } else {

            // doesnt exist
            return null;
        }

        // reverse
    }
}
// @lc code=end

