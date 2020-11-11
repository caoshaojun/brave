package com.brave.solid.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description LRU缓存机制[利用栈的后进先出原则]
 * <p>
 * 用双向链表也是可以代替栈的
 * @createTime 2020年11月11日 23:53:00
 */
public class LRUCache {
    private Map<Integer, Integer> map;
    private Stack<Integer> stack;
    private int size;

    public LRUCache(int capacity) {
        stack = new Stack<>();
        size = capacity;
        map = new HashMap<>(capacity);
    }

    public int get(int key) {
        if (!stack.contains(key)) {
            return -1;
        }
        // 如果有，则移动到栈的最前面去
        stack.remove(Integer.valueOf(key));
        stack.push(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (stack.contains(key)) {
            stack.remove(Integer.valueOf(key));
        } else {
            if (stack.size() == size) {
                int oldKey = stack.remove(0);
                map.remove(oldKey);
            }
        }
        stack.push(key);
        map.put(key, value);
    }
}
