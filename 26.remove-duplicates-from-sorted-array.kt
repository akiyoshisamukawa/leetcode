/*
 * @lc app=leetcode id=26 lang=kotlin
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var tmp = nums.distinct()
        for ((index, value) in nums.withIndex()) {
            nums[index] = if (tmp.size > index) tmp[index] else 0
        }

        return tmp.size
    }
}
// @lc code=end

