/*
 * @lc app=leetcode id=69 lang=kotlin
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution {
    fun mySqrt(x: Int): Int {
        var sq = 0
        for (i in 1..(2147483648 - 1)) {
            if (x < i.toLong() * i.toLong()) {
                sq = i - 1
                break
            }
        }

        return sq
    }
}
// @lc code=end

