package com.java.LambdaExpression;


//Java has 3 types of interface
//1.Normal interface - interface with more than one methods
//2.FunctionalInterface - interface with one and only method
//3.Marked interface - interface with no method at all


interface  A{
    public void show();
}
abstract class B{
    abstract public void s();

}
public class Anonymousclass {
    public static void main(String[] args) {
        //A a = new A() ;
        //A' is abstract; cannot be instantiated
        // to overcome this we can create another class  B and implements A and instantiate using class B
        // if the req is to use it for one time , we can declare the method definition when we instantiate

        A a = new A(){
            public void show(){
                System.out.println("print from anonymous class A ");
            }
        };
        a.show();

        B b = new B(){
            public void s(){
                System.out.println("print from anonymous class B ");
            }
        };

    }
}
