package com.brave.solid.leetcode;

import java.util.Stack;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 有效的括号
 * @createTime 2020年10月28日 13:32:00
 */
public class ValidParentheses {
    public static void main(String[] args) {
        Boolean re = isValid("{[}");
        System.out.println(re);
    }

    // 遍历整个字符串
    // 遇到左括号则入栈
    // 遇到右括号后
    // 【1 如果栈不为空，而且栈里是对应的左括号，则出栈一个，继续循环
    //  2 如果栈不为空，而且栈里不是对应的左括号，返回false
    //  3 如果栈为空则返回false】

    /**
     * 是否为有效括号字符串
     *
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        if ("".equals(s) || s.length() == 0) {
            return true;
        }
        Stack stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 做括号入栈
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                // 遇到右括号
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = (char)stack.pop();
                if(ch == ')' && topChar != '('){
                    return false;
                }
                if(ch == '}' && topChar != '{'){
                    return false;
                }
                if(ch == ']' && topChar != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
