package com.godboy.thread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread mt = new MyThread("我的线程") ;  // 实例化Runnable子类对象
        Thread t = new Thread(mt,"线程");     // 实例化Thread对象
        t.setPriority(Thread.MIN_PRIORITY) ;
        t.start() ; // 启动线程
        for(int i=0;i<50;i++){
            if(i>10){
                try{
                    t.join() ;  // 线程强制运行
                }catch(InterruptedException e){
                }
            }
            System.out.println("Main线程运行 --> " + i) ;
        }
    }
}
