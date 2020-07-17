/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {

    int n;
    int m;
    public int numIslands(char[][] grid) {

        if (grid.length == 0) {
            return 0;
        }

        int count = 0;
        n = grid.length;
        m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    DSFMarking(i, j, grid);
                }
            }
        }

        return count;
        
    }

    private void DSFMarking(int i, int j, char[][] grid) {

        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';
        DSFMarking(i+1, j, grid);
        DSFMarking(i-1, j, grid);
        DSFMarking(i, j+1, grid);
        DSFMarking(i, j-1, grid);
    }
}
// @lc code=end

