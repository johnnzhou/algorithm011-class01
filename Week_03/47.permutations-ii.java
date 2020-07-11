import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        if (nums.length == 0) {
            return new ArrayList<List<Integer>>();
        }
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<List<Integer>>();
        boolean[] used = new boolean[nums.length];
        helper(0, nums, used, res, new ArrayList<>());
        
        return new ArrayList<>(res);
        
    }

    private void helper(int currentLevel, int[] nums, boolean[] used, Set<List<Integer>> res, List<Integer> temp) {

        // terminator
        if (currentLevel == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        // process current logic
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                temp.add(nums[i]);
                used[i] = true;
                helper(currentLevel+1, nums, used, res, temp);
                used[i] = false;
                temp.remove(temp.size() - 1);
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }

        // drill down

        // reverse

    }
}
// @lc code=end

