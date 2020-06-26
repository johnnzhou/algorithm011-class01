import java.util.Stack;

import org.graalvm.compiler.nodes.calc.LeftShiftNode;

/*
 * @lc app=leetcode id=42 lang=java
 *
 * [42] Trapping Rain Water
 */

// @lc code=start
class Solution {

    // 1. stack
    // 2. 2 pointers
    public int trap(int[] height) {

        int val = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    val += (leftMax - height[left]);
                }
                left++;
            } else {

                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    val += (rightMax - height[right]);
                }
                right--;
            }
        }

        return val;



		// Stack<Integer> stack = new Stack<>();
		// int vol = 0;

		// for (int i = 0; i < height.length; i++) {

		// 	if (!stack.isEmpty() && height[i] > height[stack.peek()]) {
        //         int floor = stack.pop();
                
        //         // has left bound
		// 		if (!stack.isEmpty()){
		// 			int waterHeight = Math.min(height[i], height[stack.peek()]) - height[floor];
		// 			int length = i - stack.peek() - 1;
		// 			vol += waterHeight * length;
		// 		}
		// 		i--;
		// 	} else {
		// 		stack.push(i);
		// 	}
		// }
		// return vol;
    }
}
// @lc code=end

