/*
 * @lc app=leetcode id=860 lang=java
 *
 * [860] Lemonade Change
 */

// @lc code=start
class Solution {
	public boolean lemonadeChange(int[] bills) {

		if (bills.length == 0) {
			return true;
		}

		int[] denominations = new int[2];
		
		for (int i = 0; i < bills.length; i++) {
			
			if (bills[i] == 5) {
				denominations[0]++;
			} else if (bills[i] == 10) {
				denominations[0]--;
				denominations[1]++;
			} else if ( denominations[1] > 0 ){
                denominations[1]--;
                denominations[0]--;
			} else {
                denominations[0] -= 3;
            }
			if (denominations[0] < 0) {
				return false;
			}	
		}
		
		return true;
		
	}
}
// @lc code=end

