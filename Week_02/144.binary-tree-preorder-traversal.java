/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    // DFS
    // recursion
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Stack<TreeNode> s = new Stack<>();
        List<Integer> res = new ArrayList<>();
        s.add(root);
        
        while (!s.isEmpty()) {
            TreeNode node = s.pop();
            res.add(node.val);
            
            if (node.right != null) {
                s.push(node.right);    
            }
            
            if (node.left != null) {
                s.push(node.left);    
            }
        }
        
        return res;
    }
}
// @lc code=end

