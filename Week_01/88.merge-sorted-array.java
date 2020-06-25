import java.util.Stack;

/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start

// 1. stack (very slow memory-consuming)
// 2. two pointers
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] temp = new int[m + n];

        int i = 0;
        int j = 0;
        int index = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                temp[index] = nums1[i];
                i++;
            } else {
                temp[index] = nums2[j];
                j++;
            }

            index++;
        }

        for (;i < m; i++) {
            temp[index] = nums1[i];
            index++;
        }

        for(; j < n; j++) {
            temp[index] = nums2[j];
            index++;
        }

        for (int k = 0; k < temp.length; k++) {
            nums1[k] = temp[k];
        }

        // Stack<Integer> s1 = new Stack<>();
        // Stack<Integer> s2 = new Stack<>();

        // for (int i = m; i >= 0; i--) {
        //     s1.push(nums1[i]);
        // }

        // for (int i = n; i >= 0; i--) {
        //     s2.push(nums2[i]);
        // }

        // int index = 0;
        // while (!s1.isEmpty() && !s2.isEmpty()) {
        //     nums1[index] = s1.peek() <= s2.peek() ? s1.pop() : s2.pop();
        //     index++;
        // }
        
        // while (!s1.isEmpty()) {
        //     nums1[index] = s1.pop();
        //     index++;
        // }

        // while (!s2.isEmpty()) {
        //     nums1[index] = s2.pop();
        //     index++;
        // }
    }
}
// @lc code=end

