import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode id=589 lang=java
 *
 * [589] N-ary Tree Preorder Traversal
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    // DFS
    public List<Integer> preorder(Node root) {

        if (root == null) {
            return new ArrayList<>();
        }

        // List<Integer> res = new ArrayList<>();

        // preOrder(root, res);

        // return res;

        Stack<Node> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            for (int i = node.children.size() - 1; i >= 0; i--) {
                stack.push(node.children.get(i));
            }

            res.add(node.val);
        }

        return res;
    }


    private void preOrder(Node node, List<Integer> list) {

        if (node != null) {
            list.add(node.val);
            for(Node child : node.children) {
                preOrder(child, list);
            }
        }
    }
}
// @lc code=end

