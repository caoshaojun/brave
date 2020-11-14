package com.brave.solid.leetcode;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 最长回文串
 * @createTime 2020年11月14日 16:23:00
 */
public class LongestPalindrome {
    public static void main(String[] args) {
      int re = solution("abccccdd");

         System.out.println(re);
    }

    public static int solution(String s) {
        // 记录各小写字母个数
        int[] l = new int[26];
        // 记录各大写字母个数
        int[] b = new int[26];
        for (int i = 0; i < s.length(); i++) {
            // ASCII 编码 'A'-'Z'对应的是 65-90  'a'-'z' 对应的是 97-122
            int diff = s.charAt(i) - 'A';
            if (diff < 26) {
                b[diff] += 1;
            } else {
                diff = s.charAt(i) - 'a';
                l[diff] += 1;
            }
        }
        int re = 0;
        for (int num : l) {
            // 如果是基数，先取出偶数个
            re += num / 2 * 2;
            if (num % 2 != 0 && re % 2 == 0) {
                re++;
            }
        }
        for (int num : b) {
            re += num / 2 * 2;
            if (num % 2 != 0 && re % 2 == 0) {
                re++;
            }
        }
        return re;
    }
}
