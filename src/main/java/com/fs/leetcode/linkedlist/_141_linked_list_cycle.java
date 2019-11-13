package com.fs.leetcode.linkedlist;

/**
 * Given a linked list, determine if it has a cycle in it.
 * <p>
 * Input: head = [3,2,0,-4], pos = 1
 * Output: true
 * <p>
 * 解题思路：快慢指针
 */
public class _141_linked_list_cycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }

            fast = fast.next.next;
            slow = slow.next;
        }

        return true;
    }
}
