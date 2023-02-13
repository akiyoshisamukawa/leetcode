/*
 * @lc app=leetcode id=66 lang=kotlin
 *
 * [66] Plus One
 */
//[9,8,7,6,5,4,3,2,1,0]
// @lc code=start
class Solution {
    fun plusOne(digits: IntArray): IntArray {
        var arr = arrayOf<Int>()
        var isCarry = true
        digits.reversedArray().forEach {
            if (it == 9 && isCarry) {
                arr += 0
                isCarry = true
            } else if (isCarry) {
                arr += it + 1
                isCarry = false
            } else {
                arr += it
            }
        }
        if (isCarry) {
            arr += 1
        }

        return arr.reversedArray().toIntArray()
    }
}
// @lc code=end

