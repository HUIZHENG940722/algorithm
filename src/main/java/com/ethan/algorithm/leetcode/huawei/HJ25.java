package com.ethan.algorithm.leetcode.huawei;

/**
 * @Author zhenghui
 * @Description K个一组翻转链表
 * @Date 2022/8/6
 */
public class HJ25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        return null;
    }

    public class ListNode {
        int val;
        HJ24.ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, HJ24.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
