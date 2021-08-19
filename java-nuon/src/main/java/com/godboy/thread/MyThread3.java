package com.godboy.thread;

public class MyThread3 implements Runnable {

    @Override
    public void run() {
        System.out.println("1、进入 run() 方法");

        try {
            Thread.sleep(10000);
            System.out.println("2、线程休眠完成");
        } catch (InterruptedException e) {
            System.out.println("3、休眠被终止");
            return;
        }
        System.out.println("4、 run() 方法正常结束");
    }
}
