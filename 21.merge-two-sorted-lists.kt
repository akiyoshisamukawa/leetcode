/*
 * @lc app=leetcode id=21 lang=kotlin
 *
 * [21] Merge Two Sorted Lists
 */

// @lc code=start
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        list1 ?: list2 ?: return null
        list1 ?: return list2
        list2 ?: return list1

        return if (list1.`val` < list2.`val`) {
            list1.next = mergeTwoLists(list1.next, list2)
            list1
            }
        else {
            list2.next = mergeTwoLists(list1, list2.next)
            list2
        }
    }
}
// @lc code=end

