package com.brave.solid.leetcode;

import sun.awt.geom.AreaOp;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 盛最多水的容器
 * @createTime 2020年11月03日 22:51:00
 */
public class MaxArea {

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int[] height2 = new int[]{4,3,2,1,4};
        int res = solution(height);
        int res2 = solution(height2);
        System.out.println(res);
        System.out.println(res2);
    }

    public static int solution(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int re = 0;
        while (i < j) {
            int area = (j - i) * Math.min(height[i], height[j]);
            re = Math.max(area, re);
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return re;
    }
}
