package com.brave.solid.leetcode;

import com.brave.solid.model.ListNode;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 两数相加
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * @createTime 2020年10月30日 09:28:00
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next = new ListNode(4);

        ListNode listNode = solution(l1, l2);

        outPutListNode(listNode);
    }


    public static ListNode solution(ListNode l1, ListNode l2) {
        ListNode aHead = new ListNode(0);
        ListNode p = l1, q = l2, cur = aHead;
        // 进位
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + carry;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            carry = sum / 10;
            p = (p != null) ? p.next : null;
            q = (q != null) ? q.next : null;
        }
        if (carry != 0) {
            cur.next = new ListNode(carry);
        }
        return aHead.next;
    }


    private static void outPutListNode(ListNode node) {
        while (node != null) {
            ListNode temp = node;
            System.out.println(temp.val);
            node = node.next;
        }
    }
}
