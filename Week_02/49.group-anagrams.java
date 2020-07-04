import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    if (strs.length == 0) {
        return new ArrayList<>();
    }        

    Map<String, List<String>> map = new HashMap<>();
    for (String s : strs) {
        int[] count = new int[26];

        for(char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            sb.append("#");
            sb.append(count[i]);
        }

        String key = sb.toString();
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(s);
    }


    return new ArrayList(map.values());

    }
}
// @lc code=end

