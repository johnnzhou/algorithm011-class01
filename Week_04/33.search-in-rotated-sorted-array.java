/*
 * @lc app=leetcode id=33 lang=java
 *
 * [33] Search in Rotated Sorted Array
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {

        if (nums.length == 0) {
            return -1;
        } else if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (  nums[lo] > nums[mid] ) {
                // left rotate
                if ( target > nums[mid] && target <= nums[hi] ) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            } else {
                if ( target < nums[mid] && target >= nums[lo] ) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }

        return -1;
        
    }
}
// @lc code=end

