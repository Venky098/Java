package com.java.threadsdemo;

//Thread.sleep()
// interrupt a thread


import java.util.concurrent.locks.LockSupport;

class sct extends Thread{

    @Override
    public void run() {
        for (int i=0;i<10000;i++){
            System.out.println("sct thread");
        }
    }
}
class cst extends Thread{
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println("cst thread");
            if (i == 2000) {
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    System.out.println("i got interrupted");
                    throw new RuntimeException("i got interrupted");
                }
            }
        }
    }
}
public class threadsleepdemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new cst();
        t.start();
        for (int i=1;i<=10;i++){
            System.out.println("main  thread");
            System.out.println(t.getState()+"t is alive"+ t.isAlive());
            t.interrupt();

            System.out.println("called interrupt");
            if (i == 2) {
                Thread.sleep(20000);
            }
        }
    }
}



//States of Thread or Thread life cycle.
//public enum State {
//    /**
//     * Thread state for a thread which has not yet started.
//     */
//    NEW,
//
//    /**
//     * Thread state for a runnable thread.  A thread in the runnable
//     * state is executing in the Java virtual machine but it may
//     * be waiting for other resources from the operating system
//     * such as processor.
//     */
//    RUNNABLE,
//
//    /**
//     * Thread state for a thread blocked waiting for a monitor lock.
//     * A thread in the blocked state is waiting for a monitor lock
//     * to enter a synchronized block/method or
//     * reenter a synchronized block/method after calling
//     * {@link Object#wait() Object.wait}.
//     */
//    BLOCKED,
//
//    /**
//     * Thread state for a waiting thread.
//     * A thread is in the waiting state due to calling one of the
//     * following methods:
//     * <ul>
//     *   <li>{@link Object#wait() Object.wait} with no timeout</li>
//     *   <li>{@link #join() Thread.join} with no timeout</li>
//     *   <li>{@link LockSupport#park() LockSupport.park}</li>
//     * </ul>
//     *
//     * <p>A thread in the waiting state is waiting for another thread to
//     * perform a particular action.
//     *
//     * For example, a thread that has called <tt>Object.wait()</tt>
//     * on an object is waiting for another thread to call
//     * <tt>Object.notify()</tt> or <tt>Object.notifyAll()</tt> on
//     * that object. A thread that has called <tt>Thread.join()</tt>
//     * is waiting for a specified thread to terminate.
//     */
//    WAITING,
//
//    /**
//     * Thread state for a waiting thread with a specified waiting time.
//     * A thread is in the timed waiting state due to calling one of
//     * the following methods with a specified positive waiting time:
//     * <ul>
//     *   <li>{@link #sleep Thread.sleep}</li>
//     *   <li>{@link Object#wait(long) Object.wait} with timeout</li>
//     *   <li>{@link #join(long) Thread.join} with timeout</li>
//     *   <li>{@link LockSupport#parkNanos LockSupport.parkNanos}</li>
//     *   <li>{@link LockSupport#parkUntil LockSupport.parkUntil}</li>
//     * </ul>
//     */
//    TIMED_WAITING,
//
//    /**
//     * Thread state for a terminated thread.
//     * The thread has completed execution.
//     */
//    TERMINATED;
//}

