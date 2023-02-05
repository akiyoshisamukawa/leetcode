/*
 * @lc app=leetcode id=13 lang=kotlin
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    fun romanToInt(s: String): Int {
        val str1 = s.replace(Regex("(IV|IX|XL|XC|CD|CM)")) {
            when(it.value) {
                "IV" -> "IIII"
                "IX" -> "VIIII"
                "XL" -> "XXXX"
                "XC" -> "LXXXX"
                "CD" -> "CCCC"
                "CM" -> "DCCCC"
                else -> it.value
            }
        }

        var sum = 0;
        str1.toCharArray().forEach{ i ->
            when(i) {
                'I' -> sum += 1
                'V' -> sum += 5
                'X' -> sum += 10
                'L' -> sum += 50
                'C' -> sum += 100
                'D' -> sum += 500
                'M' -> sum += 1000
                else -> sum
            }
        }

        return sum
    }
}
// @lc code=end

