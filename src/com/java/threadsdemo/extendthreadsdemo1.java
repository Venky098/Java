package com.java.threadsdemo;



//Defining a Thread
//class Thread1 extends Thread{
//
//    public void run(){
//        //Job of a thread
//        for( int i=0;i<10;i++){
//            //executes by child thread
//            System.out.println("child thread"+i);
//        }
//    }
//
//}
class Thread2 extends Thread{

    public void start(){

            System.out.println("overriden start method");
    }
    public void run(){
            System.out.println("overriden run method");

    }

}

public class extendthreadsdemo1 extends Thread{
    public static void main(String[] args) {// main thread execute main method
        //Instantiate a Thread
        Thread2 t2 = new Thread2();
        t2.start();
        t2.run();
        // no new thread is created and main thread will execute the run method by main thread

        for( int i=0;i<10;i++){
            System.out.println("main thread"+i);
        }
    }

}
