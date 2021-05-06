package com.brave.solid.controller;

/**
 * @author caoshaojun
 * @version 1.0.0
 * @Description 多线程实现交替打印ABC
 * 思路：
 * 三个线程分别去打印A/B/C，核心问题是线程间的同步问题
 * @createTime 2021年02月23日 16:47:00
 */
public class PrintABC {
    public static class ThreadRuner implements Runnable {
        /**
         * 打印的字符
         */
        private String name;
        /**
         * 前一个线程的锁
         */
        private Object pre;
        /**
         * 当前线程的锁
         */
        private Object self;

        private ThreadRuner(String name, Object pre, Object self) {
            this.name = name;
            this.pre = pre;
            this.self = self;
        }

        @Override
        public void run() {
            int count = 10;
            while (count > 0) {
                synchronized (pre) {
                    synchronized (self) {
                        System.out.print(name);
                        count--;
                        self.notifyAll();
                    }
                    try {
                        if (count == 0) {
                            pre.notifyAll();
                        }else {
                            pre.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        ThreadRuner threadRunerA = new ThreadRuner("A", c, a);
        ThreadRuner threadRunerB = new ThreadRuner("B", a, b);
        ThreadRuner threadRunerC = new ThreadRuner("C", b, c);
        new Thread(threadRunerA).start();
        Thread.sleep(10);
        new Thread(threadRunerB).start();
        Thread.sleep(10);
        new Thread(threadRunerC).start();
        Thread.sleep(10);
    }
}
