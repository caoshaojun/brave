package com.brave.solid.leetcode;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 爬楼梯
 * @createTime 2020年10月29日 17:18:00
 */
public class ClimbStairs {

    public static void main(String[] args) {
        int re = solution(3);
        System.out.println(re);
    }

    public static int solution(int n) {
        if (n < 2) {
            return n;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3;i<= n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
