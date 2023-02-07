/*
 * @lc app=leetcode id=20 lang=kotlin
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    fun isValid(s: String): Boolean {
        return s.chunked(1).reduce { tmp, value ->
            if (tmp.length == 0) {
                value
            } else {
                val last = tmp.last()
                if (last == '(' && value == ")") {
                    tmp.dropLast(1)
                }
                else if (last == '{' && value == "}") {
                    tmp.dropLast(1)
                }
                else if (last == '[' && value == "]") {
                    tmp.dropLast(1)
                } else {
                    tmp + value
                }
            }
        }.length == 0
    }
}
// @lc code=end

