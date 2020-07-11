import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
class Solution {
	public List<List<Integer>> permute(int[] nums) {

		if (nums.length == 0) {
			return new ArrayList<List<Integer>>();
		}

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        boolean[] used = new boolean[nums.length];
		helper(0, nums, used, res, new ArrayList<>());
		return res;
		
	}

	private void helper(int currentLevel, int[] nums, boolean[] used, List<List<Integer>> res, List<Integer> temp) {

		// terminator
		if (currentLevel == nums.length) {
			res.add(new ArrayList<>(temp));
			return;
		}

		// process current logic
		for (int i = 0; i < nums.length; i++) {

			if (!used[i]) {
                used[i] = true;
				temp.add(nums[i]);
                helper(currentLevel+1, nums, used, res, temp);
                used[i] = false;
				temp.remove(temp.size() - 1);
			}
		}

		// drill down

		// reverse
	}

}
// @lc code=end

