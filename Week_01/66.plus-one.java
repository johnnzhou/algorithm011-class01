/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start

// 1. traverse the array reversely
// 2. stack
class Solution {
    public int[] plusOne(int[] digits) {

        int length = digits.length;
        int[] res = new int[length + 1];

        res[length] = (digits[length - 1] + 1) % 10;
        int carry = (digits[length - 1] + 1) / 10;

        for (int i = digits.length - 2; i >= 0; i--) {
            res[i + 1] = (digits[i] + carry) % 10;
            carry = (digits[i] + carry) / 10;
        }

        if (carry == 0) {
            for (int i = 0; i < length; i++) {
                digits[i] = res[i + 1];
            }

            return digits;
        }

        res[0] = carry;

        return res;

        // int length = digits.length;
        // int[] res = new int[length + 1];
        // int carry = 0;

        // operation on stack is slow
        // Stack<Integer> stack = new Stack<>();

        // for (int i = 0; i < length; i++) {
        //     stack.push(digits[i]);
        // }

        // int index = length;
        // res[index] = (stack.peek() + 1) % 10;
        // carry = (stack.pop() + 1) / 10;
        // index--;
        // while (!stack.isEmpty()) {
        //     res[index] = (stack.peek() + carry) % 10;
        //     carry = (stack.pop() + carry) / 10;
        //     index--;
        // }

        // if (carry == 0) {
        //     for (int i = 0; i < length; i++) {
        //         digits[i] = res[i + 1];
        //     }

        //     return digits;
        // } else {
        //     res[0] = carry;
        //     return res;
        // }



        
    }
}
// @lc code=end

