package com.godboy.thread;

public class ThreadDemo4 {
    public static void main(String[] args) {
        MyThread4 myThread4 = new MyThread4();
        Thread t1 = new Thread(myThread4);
        Thread t2 = new Thread(myThread4);
        Thread t3 = new Thread(myThread4);
        t1.start();
        t2.start();
        t3.start();
    }
}
