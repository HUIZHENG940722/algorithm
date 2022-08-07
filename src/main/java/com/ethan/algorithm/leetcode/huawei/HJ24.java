package com.ethan.algorithm.leetcode.huawei;

/**
 * @Author zhenghui
 * @Description 两两交换链表中的节点
 * @Date 2022/8/6
 */
public class HJ24 {
    public ListNode swapPairs(ListNode head) {
        ListNode p = new ListNode(0, head);
        ListNode result = p;
        if (head==null) {
            return result.next;
        }
        ListNode p1 = head, p2 = head.next;
        while (p1 != null && p2 != null) {
            p.next = p2;
            ListNode temp = p2.next;
            p2.next = p1;
            p1.next = temp;
            p = p.next.next;
            p1 = p.next;
            if (p1 != null) {
                p2 = p1.next;
            } else {
                p2 = null;
            }
        }
        return result.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
