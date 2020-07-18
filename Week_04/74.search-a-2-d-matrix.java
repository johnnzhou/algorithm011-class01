/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {

        int height = matrix.length;
        if (height == 0) {
            return false;
        }
        
        int length = matrix[0].length;
        if (length == 0) {
            return false;
        }
        
		if (target < matrix[0][0] || target > matrix[height  - 1][length - 1]) {
			return false;
		}

		int floor = height - 1;
		while (floor >= 0) {
			if (target >= matrix[floor][0] && target <= matrix[floor][length - 1]) {
				return binarySearch(matrix[floor], target);
			} else {
				floor--;
			}
		}
		return false;
	}

	private boolean binarySearch(int[] nums, int target) {

		int lo = 0;
		int hi = nums.length;

		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;

			if (nums[mid] == target) {
				return true;
			} else if (target > nums[mid]) {
				lo = mid + 1;
			} else {
				hi = mid  - 1;
			}
		}

		return false;
    }
}
// @lc code=end

