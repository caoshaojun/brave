package com.brave.solid.leetcode;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 最长公共前缀
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * @createTime 2020年11月02日 22:56:00
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = new String[]{"flower","flow","flight"};
        String[] strsSecond = new String[]{"dog","racecar","car"};

        System.out.println("[\"flower\",\"flow\",\"flight\"]:"+solution(strs));
        System.out.println("[\"dog\",\"racecar\",\"car\"]:"+solution(strsSecond));
    }

    public static String solution(String[] strs) {
        String re = "";
        // 如果没有字符，则为""
        if (strs.length == 0) {
            return re;
        }
        // 如果只有一个字符，则为本身
        if (strs.length == 1) {
            return strs[0];
        }
        re = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(re)) {
                re = re.substring(0, re.length() - 1);
                if(re.length() == 0){
                    return "";
                }
            }
        }
        return re;
    }
}
