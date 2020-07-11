import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=105 lang=java
 *
 * [105] Construct Binary Tree from Preorder and Inorder Traversal
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {

            map.put(inorder[i], i);
            
        }
        int count = preorder.length;

        // preorder: [root, [left subtree], [rightsubtree]]
        // inorder: [[left subtree], root, [right subtree]]
        return helper(map, 0, count - 1, 0, count - 1, preorder, inorder);
        
    }

    private TreeNode helper(Map<Integer, Integer> map, int preLeft, int preRight, int inLeft, int inRight, int[] preorder, int[] inorder) {

        // terminator
        if (preLeft > preRight) {
            return null;
        }

        // process current logic
        int preRoot = preLeft;
        int inRoot = map.get(preorder[preRoot]);
        TreeNode node = new TreeNode(preorder[preRoot]);

        // the number nodes in the left subtree
        int numOfLeftSubTree = inRoot - inLeft;

        //drill down

        TreeNode left = helper(map, preLeft + 1, preLeft + numOfLeftSubTree, inLeft, inRoot - 1, preorder, inorder);
        TreeNode right = helper(map, preLeft + numOfLeftSubTree + 1, preRight, inRoot + 1, inRight, preorder, inorder);

        node.left = left;
        node.right = right;
        
        return node;
    }
}
// @lc code=end

