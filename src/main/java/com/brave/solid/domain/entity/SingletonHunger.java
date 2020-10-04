package com.brave.solid.domain.entity;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 单例饿汉
 * @createTime 2020年10月04日 16:07:00
 */
public class SingletonHunger {
    private static final SingletonHunger singletonHunger = new SingletonHunger();

    private SingletonHunger(){

    }

    public static SingletonHunger getInstance(){
        return singletonHunger;
    }

}
