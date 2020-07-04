import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] res = new int[k];
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
                (o1, o2) -> (o2.getValue() - o1.getValue()));

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (map.containsKey(nums[i])) {
                count = map.get(nums[i]) + 1;
            }

            map.put(nums[i], count);
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            queue.add(entry);
        }

        for (int i = 0; i < k; i++) {
            res[i] = queue.poll().getKey();
        }

        return res;        
    }
}
// @lc code=end

