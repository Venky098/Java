package com.java.threadsdemo;


//Deadlock
class childThread extends Thread{
    public static Thread mt;

    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("child thread");
            try {
                mt.join(); // used to wait until main thread completes
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

//if we use t.join() in main method , our main thread will wait until t thread completes
//if we use mt.join()  in Childthread method , our t thread will wait until mt thread completes
// if we use t.join() in main method and mt.join() in Childthread method , both will wait for each other to complete other threads and causes Deadlock situation.
// if we use t.join() in Childthread method and mt.join() in main method if a thread calls join() method that will also cause deadlock situation.
public class childjoindemo {
    public static void main(String[] args) throws InterruptedException {
        childThread.mt = Thread.currentThread();
        childThread ct = new childThread();
        Thread   t = new Thread(ct);
        t.start();
        t.join(); // used to wait until t thread completes
        for(int i=0;i<10;i++){
            System.out.println("main thread");
        }
    }
}
