/*
 * @lc app=leetcode id=14 lang=kotlin
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        return strs.reduce{ tmp, str ->
            var i = str.length
            var result: String = ""
            while (i != 0) {
                if (tmp.startsWith(str.substring(0, i))) {
                    result = str.substring(0, i)
                    break
                }
                i--
            }

            if (result != null) result else tmp
        }
    }
}
// @lc code=end

