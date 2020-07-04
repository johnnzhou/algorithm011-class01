import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/*
 * @lc app=leetcode id=264 lang=java
 *
 * [264] Ugly Number II
 */

// @lc code=start

// 1. heap
// 2. dp
class Solution {
    public int nthUglyNumber(int n) {

        if (n == 1) {
            return 1;
        }

        int[] primes = new int[] {2,3,5};
        PriorityQueue<Long> list = new PriorityQueue<>();
        list.add(1l);

        for (int i = 1; i < n; i++) {
            long num = list.poll();
            while (!list.isEmpty() && list.peek() == num) {
                list.poll();
            }

            for (int j = 0; j < primes.length; j++) {
                list.add(num * primes[j]);
            }
        }

        return list.poll().intValue();
    }
}
// @lc code=end

