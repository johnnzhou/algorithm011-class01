import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
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

    // 1. recursion
    // 2. stack
    public List<Integer> inorderTraversal(TreeNode root) {

        // List<Integer> res = new ArrayList<>();
        // helper(root, res);

        // return res;

        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.empty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            res.add(current.val);
            current = current.right;
        }

        return res;

        
    }

    private void helper(TreeNode node, List<Integer> list) {

        if (node != null) {
            if (node.left != null) {
                helper(node.left, list);
            }
            
            list.add(node.val);

            if (node.right != null) {
                helper(node.right, list);
            }
        }

    }
}
// @lc code=end

