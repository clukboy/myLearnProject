package com.godboy.thread;

public class ThreadDemo5 {
    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5() ;      // 控制张三
        MyThread5 t2 = new MyThread5() ;      // 控制李四
        t1.flag = true ;
        t2.flag = false ;
        Thread thA = new Thread(t1) ;
        Thread thB = new Thread(t2) ;
        thA.start() ;
        thB.start() ;
    }
}
