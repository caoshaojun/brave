package com.brave.solid.leetcode;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 懒汉模式
 * @createTime 2020年12月15日 08:39:00
 */
public class Single2 {
    private static Single2 single2 = null;

    private Single2(){}

    // 双重校验
    public static synchronized Single2 getInstance(){
        // 第一个校验是防止每次进来直接排队等待获取锁，如果有了实例则直接返回
        if (single2 == null){
            synchronized (Single2.class){
                // 第二次校验是防止多实例被创建，确保只有一个实例被创建
                if(single2 == null){
                    return new Single2();
                }
            }
        }
        return single2;
    }
}
