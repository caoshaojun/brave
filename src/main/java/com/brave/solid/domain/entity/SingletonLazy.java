package com.brave.solid.domain.entity;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 单例懒汉模式
 * @createTime 2020年10月04日 16:00:00
 */
public class SingletonLazy {
    private static SingletonLazy singletonLazy = null;

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getInstance() {
        synchronized (SingletonLazy.class) {
            if (singletonLazy == null) {
                singletonLazy = new SingletonLazy();
            }
            return singletonLazy;
        }
    }
}
