/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {
    public boolean isPowerOfTwo(int n) {

        if ( n==0 || n < 0 ) {
			return false;
		}
		// long x = (long) n in case of overflow
		return (n & (n - 1)) == 0;
        
    }
}
// @lc code=end

