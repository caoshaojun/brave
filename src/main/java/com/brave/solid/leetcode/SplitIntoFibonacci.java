package com.brave.solid.leetcode;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description https://pic.leetcode-cn.com/1607394716-MmKzgT-image.png
 * 842. 将数组拆分成斐波那契序列 [个人觉得挺难的]
 * @createTime 2020年12月08日 16:47:00
 */
public class SplitIntoFibonacci {

    public static void main(String[] args) {
        int re = 0;
        int gg = 0;
        flag:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j == 3) {
                    re = i;
                    gg = j;
                    break flag;
                }
            }
        }
        System.out.println(re);
        System.out.println(gg);
    }
}
