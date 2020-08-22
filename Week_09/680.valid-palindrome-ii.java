/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
	public boolean validPalindrome(String s) {
		int left = 0;
		int right = s.length() - 1;
		
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return isPalindromSegment(s, left+1, right) || isPalindromSegment(s, left, right-1);
			}
			left++;
			right--;
		}
		
		return true;
	}
	
	private boolean isPalindromSegment(String s, int left, int right) {
		
		while (left < right) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
		}
		
		return true;
		
	}
}
// @lc code=end

