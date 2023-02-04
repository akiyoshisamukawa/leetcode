/*
 * @lc app=leetcode id=1 lang=kotlin
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed { index, element ->
            val targetIndex = nums.indexOf(target - element)
            if (targetIndex != -1 && targetIndex != index) {
                return intArrayOf(index, targetIndex)
            }
        }
        return intArrayOf()
    }
}
// @lc code=end

