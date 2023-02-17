/*
 * @lc app=leetcode id=70 lang=kotlin
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {
    fun climbStairs(n: Int): Int {
        when (n) {
            1 -> return 1
            2 -> return 2
            else -> {
                var i = 1
                var j = 2
                var k = 0
                (3 .. n).forEach {
                    k = j
                    j = i + j
                    i = k
                }
                return j
            }
        }
    }
}
// @lc code=end

