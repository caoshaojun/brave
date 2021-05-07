package com.brave.solid.common.aop;


/**
 * 切面切入顺序常量.(数据越小，优先级越高，切面方法越先执行)
 */
public class AspectOrderConst {

    /**
     * 暂时用没有业务的命名，有具体业务了改之即可
     */
    public static final int FIRST_ORDER_ASPECT = -3;

    /**
     * 暂时用没有业务的命名，有具体业务了改之即可
     */
    public static final int SECOND_ORDER_ASPECT = -2;

    /**
     * 暂时用没有业务的命名，有具体业务了改之即可
     */
    public static final int THIRD_ORDER_ASPECT = -3;
}
