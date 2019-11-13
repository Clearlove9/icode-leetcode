package com.fs.leetcode.linkedlist;

/**
 * Remove all elements from a linked list of integers that have value val.
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 *
 * 解题思路：由于头节点也是有可能被删除的，在头节点前面在构造一个节点
 */
public class _203_remove_linked_list_elements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        ListNode listNode = new ListNode(-1);
        listNode.next = head;

        ListNode tmp = listNode;

        while (tmp.next != null) {
            if (tmp.next.val == val) {
                tmp.next = tmp.next.next;
                continue;
            }

            tmp = tmp.next;
        }

        return listNode.next;
    }
}
