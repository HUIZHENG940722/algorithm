package com.ethan.algorithm.leetcode.test;

/**
 * @Author zWX1058539
 * @Description 两数相加
 * @Date 2022/7/7
 */
public class test_2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1, t2 = l2, t3 = new ListNode(0);
        ListNode result = t3;
        int b = 0;
        while (t1 != null || t2 != null) {
            int val1 = 0;
            int val2 = 0;
            if (t1 != null) {
                val1 = t1.val;
                t1 = t1.next;
            }
            if (t2 != null) {
                val2 = t2.val;
                t2 = t2.next;
            }
            b = (val1 + val2 + b) / 10;
            t3.next = new ListNode((val1 + val2 + b) % 10);
            t3 = t3.next;
        }
        if (b > 0) {
            t3.next = new ListNode(1, null);
        }
        return result.next;
    }

    class ListNode {
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
