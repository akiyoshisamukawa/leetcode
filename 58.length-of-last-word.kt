/*
 * @lc app=leetcode id=58 lang=kotlin
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    fun lengthOfLastWord(s: String): Int {
        var length = 0
        s.split(" ").forEach {
            if (it.length > 0) length = it.length
        }

        return length
    }
}
// @lc code=end

