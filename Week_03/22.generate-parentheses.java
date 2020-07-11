import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> res = new ArrayList<>();

        String s = "";
        generatorHelper(0, 0, s, n, res);;

        return res;
        
    }


    // 1. left must be within n
    // 2. there is a left parenthesis before right paren
    private void generatorHelper(int left, int right, String s, int n, List<String> list) {

        if (left == n && right == n) {
            list.add(s);
            return;
        }
        
        if (left < n) {
            generatorHelper(left + 1, right, s + "(", n, list);
        }

        if (left > right) {
            generatorHelper(left, right + 1, s + ")", n, list);
        }
    }
}
// @lc code=end

