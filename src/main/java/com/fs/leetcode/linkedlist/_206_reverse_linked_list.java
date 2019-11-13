package com.fs.leetcode.linkedlist;

/**
 * Reverse a singly linked list.
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 */
public class _206_reverse_linked_list {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode curr = head, tmp = curr.next;

        while (tmp != null) {
            curr.next = prev;
            prev = curr;
            curr = tmp;
            tmp = tmp.next;
        }

        curr.next = prev;

        return curr;
    }
}
