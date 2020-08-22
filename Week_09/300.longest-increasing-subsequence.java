/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        
        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
        }
        
        int max = 0;
        for ( int i = 1; i < nums.length; i++) {
            for ( int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
                
                max = Math.max(max, dp[i]);
            }
        }
        
        return max;
    }

    // if (nums.length <= 1) {
    //     return nums.length;
    // }
    
    // int[] dp = new int[nums.length];
    // dp[0] = 1;
    
    // int max = 1;
    // for ( int i = 1; i < nums.length; i++) {
    //     int maxVal = 0;
    //     for ( int j = 0; j < i; j++) {
    //         if (nums[j] < nums[i]) {
    //             maxVal = Math.max(maxVal, dp[j]);
    //         }
    //         dp[i] = maxVal + 1;
    //         max = Math.max(max, dp[i]);
    //     }
    // }
    
    // return max;
}
// @lc code=end

