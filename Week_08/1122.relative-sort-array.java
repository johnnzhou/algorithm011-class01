/*
 * @lc app=leetcode id=1122 lang=java
 *
 * [1122] Relative Sort Array
 */

// @lc code=start
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr = new int[1001];
		int[] res = new int[arr1.length];
		int index = 0;
		for (int item : arr1) arr[item]++;
		for (int item : arr2) {
			while(arr[item]-- > 0) {
				res[index] = item;
				++index;
			}
		}
		for(int i = 0; i < 1001; ++i) {
			while (arr[i]-- > 0){
				res[index] = i;
				++index;
			}
		}
		return res;
    }
}
// @lc code=end

