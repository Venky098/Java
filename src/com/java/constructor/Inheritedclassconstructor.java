package com.java.constructor;






class A{
    public A(){
        System.out.println("In A");
    }

    public A(int i){
        System.out.println("In A int ");
    }

}
class B extends A{
    public B(){
        //super();
        //super() invokes constructor of super(parent) class
        //every constructor in subclass have a default method even though we dont define
        System.out.println("In B");
    }
    public B(int i){
        //super();
        //super() invokes constructor of super(parent) class
        //even for a parameterized constructor has default method super() due to which default constructor of parent class gets invoked
        System.out.println("In B int ");
    }
}
class C extends A{

    public C(){
        super();
        //super() calls constructor of super(parent) class
        System.out.println("In C");
    }
    public C(int i){
        super(i);
        //to define which constructor to  invoke, we can specify  super class with arguments
        System.out.println("In C int ");
    }
}
public class Inheritedclassconstructor {

public static void main(String[] args){
    System.out.println("result through ob 1");
    A ob1 = new A();
    System.out.println("result through ob 2");
    B ob2 = new B();
    //whenever the class B  object is created it calls its default constructor and the inherted class(class A)'s constructor as well
    System.out.println("result through ob 3");
    B ob3 = new B(5);
    //whenever a value is passed the parameterized constructor of B and default constructor of A is called
    System.out.println("result through ob C ob4");
    C ob4 = new C();
    System.out.println("result through ob C ob5 ");
    C ob5 = new C(2);
}
}
