package com.ethan.algorithm.leetcode.huawei;

/**
 * @Author zhenghui
 * @Description 删除链表的倒数第N个结点
 * @Date 2022/8/2
 */
public class HJ19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        int len = 0;
        while (p != null) {
            p = p.next;
            len++;
        }
        // 移除的第几个
        int i = len + 1 - n;
        p = head;
        if (len==1 && n==1) {
            return null;
        }
        if (n==len) {
            return p.next;
        }
        for (int j = 1; j < i-1; j++) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;
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
