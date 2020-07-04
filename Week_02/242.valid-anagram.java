import java.util.Map;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] table = new int[26];

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        for (int i = 0; i < sChars.length; i++) {

            table[sChars[i] - 'a']++;
            table[tChars[i] - 'a']--;
        }

        for (int i = 0; i < table.length; i++) {
            if (table[i] != 0) {
                return false;
            }
        }
        

        // Map<Character, Integer> map = new HashMap<>();

        // char[] sChars = s.toCharArray();
        // char[] tChars = t.toCharArray();
        // for (int i = 0; i  < sChars.length; i++) {
        //     int count = 0;
        //     if (map.containsKey(sChars[i])) {
        //         count = map.get(sChars[i]) + 1;
                
        //     } 
        //     map.put(sChars[i], count);
        // }


        // for (int i = 0; i < tChars.length; i++) {

        //     if (map.containsKey(tChars[i]) && map.get(tChars[i]) > 0) {
        //         map.put(tChars[i], map.get(tChars[i]) - 1);
        //     } else {
        //         return false;
        //     }
        // }

        return true;
        
    }
}
// @lc code=end

