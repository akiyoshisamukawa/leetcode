/*
 * @lc app=leetcode id=9 lang=swift
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    func isPalindrome(_ x: Int) -> Bool {
        String(x) == String(String(x).reversed())
    }
}
// @lc code=end

