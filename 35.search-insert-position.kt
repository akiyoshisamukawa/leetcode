/*
 * @lc app=leetcode id=35 lang=kotlin
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var result = 0
        for ((i, value) in nums.withIndex()) {
            if (target <= value) {
                result = i
                break
            } else {
                result = i + 1
            }
        }
        return result
    }
}
// @lc code=end

