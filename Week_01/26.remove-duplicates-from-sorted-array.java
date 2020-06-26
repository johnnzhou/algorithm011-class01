/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {

    // 1. two pointers
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return 1;
        }

        int flag = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[flag - 1] != nums[i]) {
                nums[flag] = nums[i];
                flag++;
            }
        }

        return flag;

        
    }
}
// @lc code=end

