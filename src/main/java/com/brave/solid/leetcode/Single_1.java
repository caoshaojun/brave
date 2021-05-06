package com.brave.solid.leetcode;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 饿汉模式
 * @createTime 2021年02月26日 08:39:00
 */
public class Single_1 {
    public static final Single_1 single_1 = new Single_1();
    public Single_1(){}

    public static Single_1 getInstance(){
        return single_1;
    }
}
