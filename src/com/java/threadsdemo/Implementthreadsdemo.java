package com.java.threadsdemo;



// implement runnable approach allows us to use inheritance other than extends threads approach
//Runnable provides the means for a class to be active while not subclassing Thread
//In most cases, the Runnable interface should be used if you are only planning to override the run() method and no other Thread methods

class Thread3 implements Runnable{
        public final int j =1;
    @Override
    public void run() {
        for(int i =0;i<10;i++){
            System.out.println("Run method"+(j+i) );
        }

    }
}
public class Implementthreadsdemo {
    public static void main(String[] args) {
        Thread3 t3 = new Thread3();
          new Thread(t3).start();
        Thread3 t4 = new Thread3();

        //t3 target runnable
        for(int i =0;i<10;i++){
            System.out.println("Main method");
        }
        new Thread(t4).start();

    }
}
