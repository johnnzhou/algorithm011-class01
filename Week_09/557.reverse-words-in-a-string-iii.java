/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        if (s.length() <= 1) {
            return s;
        }
        
        String[] split =  s.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for (String seg : split) {
			for ( int i = seg.length() - 1; i >= 0; i-- ) {
				sb.append(seg.charAt(i));
            }
            
			sb.append(" ");
		}
		
		sb.deleteCharAt(sb.length() - 1);
		
		return sb.toString();
    }
}
// @lc code=end

