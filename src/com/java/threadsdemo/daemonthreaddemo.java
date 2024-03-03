package com.java.threadsdemo;




class ChildThread extends Thread{

    public void run(){
        for(int i =0;i<100;i++){
            System.out.println("child thread");
        }
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
public class daemonthreaddemo {
    public static void main(String[] args) {
        childThread t1 = new childThread();
        Thread t = new Thread(t1);
        t.setDaemon(true);
        t.start();
        System.out.println("main thread");
    }
}
