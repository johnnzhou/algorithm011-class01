/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {

        s = s.trim();

        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }
}
// @lc code=end

