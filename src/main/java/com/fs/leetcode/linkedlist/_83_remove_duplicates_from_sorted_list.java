package com.fs.leetcode.linkedlist;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * Input: 1->1->2
 * Output: 1->2
 */
public class _83_remove_duplicates_from_sorted_list {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode tmp = head;
        int val = tmp.val;

        while (tmp != null) {
            if (tmp.next != null && tmp.next.val == val) {
                tmp.next = tmp.next.next;
                continue;
            }

            if (tmp.next != null) {
                val = tmp.next.val;
            }

            tmp = tmp.next;
        }

        return head;
    }
}
