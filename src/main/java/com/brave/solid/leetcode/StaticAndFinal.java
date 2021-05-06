package com.brave.solid.leetcode;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description
 * @createTime 2020年12月17日 08:43:00
 */
public class StaticAndFinal {
    public static void main(String[] args)  {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        System.out.println(myClass1.i);
        System.out.println(MyClass.j);
        System.out.println(myClass2.i);
        System.out.println(MyClass.j);

    }


}
class MyClass {
    public final double i = Math.random();
    public static double j = Math.random();
}
