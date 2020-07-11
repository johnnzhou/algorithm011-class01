import java.util.*;

/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

// @lc code=start
class Solution {
	
	public List<List<Integer>> combine(int n, int k) {
		
		if (n < 1 || k <= 0) {
			return new ArrayList<List<Integer>>();
		}
		
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		helper(0, k, n, 1, res, new ArrayList<>());
		return new ArrayList<>(res);

	}


	private void helper(int currentLevel, int level, int num, int start, List<List<Integer>> res, List<Integer> temp) {
		// terminator
		if (currentLevel == level) {
			List<Integer> tmp = new ArrayList<>(temp);
			res.add(tmp);
			return;
		}

		// process current logic
		for (int i = start; i <= num; i++) {
			temp.add(i);
			helper(currentLevel+1, level,num, i+1, res, temp);
			temp.remove(temp.size() - 1);	
		}

		// drill down

		// reverse
	}

}
// @lc code=end

