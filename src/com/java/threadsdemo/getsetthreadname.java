package com.java.threadsdemo;

//Thread.yield();
// yield is used in Threads which may require longer executiion time so that checks if any thread is waiting with high priority.
//if same or low priority threads are waiting , our thread will completes its execution
//setPriority is used to set  priority ,  MAX_PRIORITY = 10; MIN_PRIORITY = 1; NORM_PRIORITY = 5;
//Thread.currentThread() gives the current executed thread
// Thread.currentThread().setName(string) used to set name of the thread . not accepting null values

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
       //use when we want to wait until other(t1) thread finishes

        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
