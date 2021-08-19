package com.godboy.thread;

/**
 * 实现 runnable 接口,作为线程的实现类
 */
public class MyThread implements Runnable {

    //线程名称
    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    //线程的操作主体
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + ":" + i);
        }
    }
}
