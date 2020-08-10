import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode id=127 lang=java
 *
 * [127] Word Ladder
 */

// @lc code=start
class Solution {
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        wordList.add(endWord);
        int dist = 1;

        while(!visited.contains(endWord)) {
            Set<String> to = new HashSet<>();
            for (String word : visited) {
                for (int j = 0; j < word.length(); j++) {
                    char[] chars = word.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[j] = c;
                        String newWord = new String(chars);
                        if (wordList.contains(newWord)) {
                            to.add(newWord);
                            wordList.remove(newWord);
                        }
                    }
                }
            }

            dist++;
            if (to.size() == 0) {
                return 0;
            }

            visited = to;
        }

        return dist;
    }

}
// @lc code=end

