package com.java.threadsdemo;


class Thread5 implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }

    }

}
public class getsetthreadname {
    public static void main(String[] args) throws InterruptedException {

        Thread.currentThread().setName("main m thread");
        Thread5 t5 = new Thread5();
        Thread t = new Thread(t5,"Hero thread");
        Thread t1 = new Thread(t5);
        t1.setName("Kevin thread");
        t1.setPriority(1);   //low priority
        t.setPriority(5); // MAx priority

        //t.setPriority(110);//IllegalArgumentException

        t1.start();
        t.start();
       t1.join();
       //use when we want to wait until other thread finishes

        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
