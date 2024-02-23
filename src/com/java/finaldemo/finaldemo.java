package com.java.finaldemo;


//final keyword is used before a constant.
//once we assign a value to a final variable we cannot change the value
//final class cannot be extended
//final method cannot be overriden


final class A{
    final int a;
    final int b =100;

    A(){
        a=10;
        //a=100; // Once a is assigned with value it cannot be override with other values
    }
    public void MethodA(){
        System.out.println("Class A");
    }
}
class C extends B {
    public void show(){
        System.out.println("Class C ");
    }
//    public void demo(){
//        'demo()' cannot override 'demo()' in 'com.java.finaldemo.B'; overridden method is final
//    }
}
class B{
    // extends A{ //Cannot inherit from final 'com.java.finaldemo.A'

    final void  demo(){
        System.out.println("demo Class B");
    }
}
public class finaldemo {
    public static void main(String[] args) {
        A a = new A();
        a.MethodA();
        B b = new B();
        b.demo();
        C c = new C();
        c.demo();
        c.show();
    }
}
