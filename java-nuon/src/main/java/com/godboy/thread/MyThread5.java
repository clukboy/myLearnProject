package com.godboy.thread;

/**
 * 死锁
 */
public class MyThread5 implements Runnable {
    private static final Zhangsan zs = new Zhangsan();
    private static final Lisi ls = new Lisi();
    public  boolean flag = false;  // 声明标志位，判断那个先说话

    @Override
    public void run() {
        if (flag) {
            synchronized (zs) {
                zs.say();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (ls) {
                    zs.get();
                }
            }
        }else{
            synchronized (ls) {
                ls.say();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (zs) {
                    ls.get();
                }
            }
        }
    }


    static class Zhangsan {
        public void say() {
            System.out.println("张三对李四说：'你给我画,我就把书给你'");
        }

        public void get() {
            System.out.println("张三得到了画");
        }
    }

    static class Lisi { // 定义李四类
        public void say() {
            System.out.println("李四对张三说：“你给我书，我就把画给你”");
        }

        public void get() {
            System.out.println("李四得到书了。");
        }
    }
}
