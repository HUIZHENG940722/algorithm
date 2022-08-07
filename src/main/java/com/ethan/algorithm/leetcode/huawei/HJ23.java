package com.ethan.algorithm.leetcode.huawei;

/**
 * @Author zhenghui
 * @Description 合并K个升序链表
 * @Date 2022/8/6
 */
public class HJ23 {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode(0);
        ListNode p = result;
        int len = lists.length;
        while (isNotEmpty(lists)) {
            ListNode min = new ListNode(Integer.MAX_VALUE);
            int index = 0;
            for (int i = 0; i < len; i++) {
                if (lists[i] != null && lists[i].val < min.val) {
                    min = lists[i];
                    index = i;
                }
            }
            p.next = min;
            p = p.next;
            lists[index] = min.next;
        }
        return result.next;
    }

    private boolean isNotEmpty(ListNode[] lists) {
        for (ListNode listNode : lists) {
            if (listNode != null) {
                return true;
            }
        }
        return false;
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
