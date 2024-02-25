package com.java.Interfacedemo;


//  if we define with @FunctionalInterface should  have only one abstract method
// interface can define and declare a method using default keyword
 @FunctionalInterface
interface  A1{
    public void show();

    default public void hide(){
        System.out.println("hide from Interface A1");
    }
}

 class B implements A1{
    @Override
    public void show() {
        System.out.println("show method from B");
    }

    @Override
    public void hide() {
        System.out.println("B overriden default hide method from interface ");
//         default methods can be overriden
    }
}

public class defaultdemo {
    public static void main(String[] args) {
        A1 a = new A1(){ public void show(){ System.out.println("print from main  class  "); } };
        A1 a1 = ()-> System.out.println("print from  main class  ");//lambda Expression
//        as we know A is an functional interface which have only one method show
//         so we can imagine which object we are creating and which method we are using so we can remove "new A(){ public void show"
//        a.show();
//        a1.show();
//        a1.hide();

//            B   b = ()-> System.out.println("abc");
//            Target type of a lambda conversion must be an interface
        B b = new B();
            b.show();
            b.hide();



    }
}
