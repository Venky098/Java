package com.java.InnerClass;



/*
    InnerClass
        MemberClass
        StaticClass


 */
class Outer{

    int a =1;
    public void show(){
        System.out.println("Outer class show");
    }


    class inner{
        public void display(){
            System.out.println("inner class display"+a);
        }
    }
    static  class inner1{
        public void display1(){
            System.out.println("Static inner class display");
        }
    }
}
public class Innerclass {

    public static void main(String[] args){
        Outer ob = new Outer();
        ob.show();
        Outer.inner  innerob = ob.new inner();
        innerob.display();
        System.out.println("before static class ");
        //to create object of inner we need to take Outer class as reference for innerclass it is not in scope
        //we can access inner class object we need to access through outerclass object(ob)


        Outer.inner1  innerob1 = new Outer.inner1();
        //As inner1 is static innerclass we can access without outerobject(through outerclass directly)
        innerob1.display1();

    }
}
