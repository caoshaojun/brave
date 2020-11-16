package com.brave.solid.leetcode;

import org.apache.commons.lang.StringUtils;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 最长回文字串
 * <p>
 * 输入: "babad"
 * 输出: "bab"
 * 注意: "aba" 也是一个有效答案。
 * <p>
 * 输入: "cbbd"
 * 输出: "bb"
 * <p>
 * 动态规划
 * <p>
 * https://img2018.cnblogs.com/i-beta/1862546/201911/1862546-20191111190624304-932851410.jpg
 * @createTime 2020年11月16日 22:45:00
 */
public class LongestPalindrome2 {

    public static String solution(String s) {
        if (StringUtils.isEmpty(s)) {
            return s;
        }
        int len = s.length();
        // flag[i][j] = true 表示i到j 之间为回文数
        boolean[][] flags = new boolean[len][len];
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < len; i++) {
            flags[i][i] = true;
            if (maxLen == 0 || maxLen == 1) {
                start = i;
                maxLen = 1;
            }
            // 相邻的两个字符相同
            if (i < len - 1 && s.charAt(i) == s.charAt(i + 1)) {
                flags[i][i + 1] = true;
                start = i;
                maxLen = 2;
            }
        }
        // m代表回文子串长度，从3开始
        for (int m = 3; m <= len; m++) {
            for (int i = 0; i < len - m; i++) {
                // 依次比较是否符合状态转移方程
                int j = i + m - 1;
                if (flags[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    flags[i][j] = true;
                    start = i;
                    maxLen = m;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
