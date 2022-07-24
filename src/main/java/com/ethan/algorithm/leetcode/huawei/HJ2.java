package com.ethan.algorithm.leetcode.huawei;

/**
 * @Author zhenghui
 * @Description 两数相加
 * @Date 2022/7/23
 */
public class HJ2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3 = result;
        int bit = 0;
        while (p1 != null || p2 != null) {
            int d1 = 0, d2 = 0;
            if (p1 != null) {
                d1 = p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                d2 = p2.val;
                p2 = p2.next;
            }
            int val = (bit + d1 + d2) % 10;
            bit = (bit + d1 + d2) / 10;
            ListNode data = new ListNode(val);
            p3.next = data;
            p3 = data;
        }
        if (bit!=0) {
            p3.next = new ListNode(bit);
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
