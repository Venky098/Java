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

public class extendthreadsdemo1 extends Thread{
    public static void main(String[] args) {// main thread execute main method
        //Instantiate a Thread
        Thread1 t1 = new Thread1();
        //start the thread
        t1.start();

        //executes by main thread
        for( int i=0;i<10;i++){
            System.out.println("main thread"+i);
        }
    }

}
