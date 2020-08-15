/*
 * @lc app=leetcode id=191 lang=java
 *
 * [191] Number of 1 Bits
 */

// @lc code=start
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        // approach 1
        // int bit = 0;
        // int mask = 1;
        // for (int i = 0; i < 32; i++) {

        //     if ((n & mask) != 0) {
        //         bit++;
        //     }
        //     mask <<= 1;
        // }

        // return bit;

        // approach 2
        int bits = 0;
        while (n != 0) {
            bits++;
            n &= ( n - 1 );
        }

        return bits;
    }
}
// @lc code=end

