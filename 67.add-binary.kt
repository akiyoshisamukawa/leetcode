/*
 * @lc app=leetcode id=67 lang=kotlin
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    fun addBinary(a: String, b: String): String {
        if (a.length < b.length) {
            return calBinary(b.reversed(), a.reversed())
        } else {
            return calBinary(a.reversed(), b.reversed())
        }
    }

    fun calBinary(a: String, b: String): String {
        val sb = StringBuilder()
        var i = 0
        var digit = 0
        while (i < b.length) {
            when (a.substring(i, i + 1).toInt() + b.substring(i, i + 1).toInt() + digit) {
                0 -> sb.append("0")
                1 -> {
                    sb.append("1")
                    digit = 0
                }
                2 -> {
                    sb.append("0")
                    digit = 1
                }
                3 -> {
                    sb.append("1")
                    digit = 1
                }
            }
            i++
        }
        while (i < a.length) {
            when (a.substring(i, i + 1).toInt() + digit) {
                0 -> sb.append("0")
                1 -> {
                    sb.append("1")
                    digit = 0
                }
                2 -> {
                    sb.append("0")
                    digit = 1
                }
            }
            i++
        }
        if (digit == 1) {
            sb.append("1")
        }

        return sb.reverse().toString()
    }
}
// @lc code=end

