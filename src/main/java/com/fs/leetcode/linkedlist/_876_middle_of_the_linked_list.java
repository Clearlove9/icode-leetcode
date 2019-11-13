package com.fs.leetcode.linkedlist;

/**
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * If there are two middle nodes, return the second middle node.
 *
 * 解题思路：快慢指针
 */
public class _876_middle_of_the_linked_list {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null) {
            if (fast.next == null) {
                slow = slow.next;
                break;
            }

            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    public static void main(String[] args) {

    }
}
