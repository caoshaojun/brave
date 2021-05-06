package com.brave.solid.leetcode;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 懒汉模式
 * @createTime 2021年02月26日 08:41:00
 */
public class Single_2 {
    public static Single_2 single_2 = null;
    public Single_2(){}

    public static synchronized Single_2 getInstance(){
        if (single_2 == null){
            synchronized (Single_2.class){
                if (single_2 == null){
                    return new Single_2();
                }
            }
        }
        return single_2;
    }
}
