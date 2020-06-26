/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {

    // 1. circular 
    public void rotate(int[] nums, int k) {

        int length = nums.length;
        k %= length;

        // the number of exchange
        int count = 0;

        for (int i = 0; count < length; i++) {

            // current index
            int current = i;

            // the previous number that will be moved to a new index
            int prev = nums[current];

            do {

                // the index that prev will move to
                int next = (current + k) % length;

                // the current value at index next
                int temp = nums[ next ];

                nums[ next ] = prev;

                // dealing with the leftover
                prev = temp;
                current = next;
                count++;
            } while (current != i);
        }
    }
}
// @lc code=end

