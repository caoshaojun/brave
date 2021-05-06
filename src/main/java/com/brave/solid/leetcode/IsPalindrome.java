package com.brave.solid.leetcode;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 验证回文串
 * 先把有效的字符取出来，然后再双指针去判断
 * @createTime 2021年03月06日 09:35:00
 */
public class IsPalindrome {

    public boolean solution(String s) {
        if (s.length() <= 1) {
            return true;
        }
        int left = 0, right = s.length() - 1;
        while (left < right) {
            // 去掉无用字符，只要字母和数字
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right++;
            }
            if (left < right && Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
