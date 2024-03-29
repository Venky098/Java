package com.java.threadsdemo;



//Defining a Thread
class Thread1 extends Thread{

    public void run(){
        //Job of a thread
        for( int i=0;i<10;i++){
            //executes by child thread
            System.out.println("child thread"+i);
        }
    }

}

//Life cycle of a thread .
//Thread1 t1 = new Thread1();
//create a thread
//t1.start();
//ready or runnable state
//if Thread scheduler allocates processor - goes to running state
//Thread.yield is called it will be again goes to ready or runnable state
//if join() is called and thread will go to waiting state , then from waiting to come to ready or runnable state
//once run method execution finish - thread goes to dead state


public class extendthreadsdemo extends Thread{
    public static void main(String[] args) {// main thread execute main method
        //Instantiate a Thread
        Thread1 t1 = new Thread1();
        //start a new thread and run run method in Thread1
        t1.start();

        //t1.start();
       // if a thread called once and we try to start same thread we gets IllegalThreadStateException

        //executes by main thread
        for( int i=0;i<10;i++){
            System.out.println("main thread"+i);
        }
    }

}
