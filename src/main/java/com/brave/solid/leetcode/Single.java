package com.brave.solid.leetcode;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 饿汉模式
 * @createTime 2020年12月15日 08:36:00
 */
public class Single {
    private static final Single single = new Single();
    private Single(){}

    public static Single getInstance(){
        return single;
    }
}
