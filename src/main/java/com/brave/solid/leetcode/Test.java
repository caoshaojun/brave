package com.brave.solid.leetcode;

import com.brave.solid.model.ListNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description
 * @createTime 2021年03月31日 20:08:00
 * 实现LRU（最近最少使用）缓存机制
 * LRUCache(capacity) 以正整数作为容量 capacity 初始化 LRU 缓存
 * get(key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
 * set(key, value) 如果关键字已经存在，则变更其数据值；如果关键字不存在，则插入该组「关键字-值」。
 * 当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。
 * 进阶：
 * 1.set/get操作在时间复杂度O(1)内完成
 * <p>
 * 1 初始化为正整数作为容量
 * 2 get(key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1
 * 3 set(key, value) 如果关键字已经存在，则变更其数据值；如果关键字不存在，则插入该组「关键字-值
 * 4 上限达到，删除最久未使用的数据值，
 * <p>
 * <p>
 * 数据结构：
 */
public class Test {

    public ListNode re(ListNode l1, ListNode l2) {
        ListNode pre1 = l1;
        ListNode pre2 = l2;
        while (pre1 != pre2) {
            if (pre1 != null) {
                pre1 = pre1.next;
            } else {
                pre1 = l2;
            }
            if (pre2 != null) {
                pre2 = pre2.next;
            } else {
                pre2 = l1;
            }
        }
        return pre1;
    }
}

