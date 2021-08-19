package com.godboy.thread;

public class ThreadDemo3 {
    public static void main(String[] args) {
        MyThread3 mt = new MyThread3();
        Thread t = new Thread(mt);
        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("3、休眠被终止") ;
        }
        t.interrupt();
    }
}
