package com.godboy.thread;

/**
 * 多线程卖票解决方案
 */
public class MyThread4 implements Runnable {

    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

//            synchronized (this) {
//                if (ticket > 0) {
//                    try {
//                        Thread.sleep(2000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("卖票:ticket = " + ticket--);
//                }else{
//                    System.out.println("票已经卖完");
//                }
//            }
//        }
            this.sale();
        }
    }

    public synchronized void sale() {    // 声明同步方法
        if (ticket > 0) {   // 还有票
            try {
                Thread.sleep(300); // 加入延迟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("卖票：ticket = " + ticket--);
        }

    }

}
