/*
 * @lc app=leetcode id=153 lang=java
 *
 * [153] Find Minimum in Rotated Sorted Array
 */

// @lc code=start
class Solution {

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;

            // the min is to the left of mid
            if(nums[mid] < nums[right]) {
                right = mid;
            } else {
                // the min is to the left of mid (exclusive) since the its not the candidate anymore
                left = mid + 1;
            }
        }
        return nums[left];
    }

    public int findMin1(int[] nums) {

        if (nums.length == 0) {
            return -1;
        } else if (nums.length == 1) {
            return nums[0];
        }

        int lo = 0;
        int hi = nums.length - 1;

        if (nums[hi] > nums[lo]) {
            return nums[lo];
        } 

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            } else if (nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if ( nums[0] < nums[mid] ) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return -1;
        
    }
}
// @lc code=end

