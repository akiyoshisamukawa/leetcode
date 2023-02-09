/*
 * @lc app=leetcode id=27 lang=kotlin
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val tmp = nums.filter { it != `val` }
        var i = 0
        while (i < nums.size) {
            nums[i] = if (i < tmp.size) tmp[i] else 0
            i++
        }

        return tmp.size
    }
}
// @lc code=end

