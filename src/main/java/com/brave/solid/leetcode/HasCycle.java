package com.brave.solid.leetcode;

import com.brave.solid.model.ListNode;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 环形链表-简单/中等
 * @createTime 2020年11月04日 19:03:00
 */
public class HasCycle {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = listNode.next;
        boolean re = hasCycle(listNode);
        System.out.println(re);
    }
    /**
     * 简单-环形链表
     *
     * @param head
     * @return
     */
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null){
            if(fast.next == null || fast.next.next == null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
