package com.godboy.thread;

public class ThreadDemo1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("线程1");
        MyThread myThread1 = new MyThread("线程2");
        Thread thread = new Thread(myThread);
        Thread thread1 = new Thread(myThread1);
        thread.start();
        thread1.start();
    }
}
