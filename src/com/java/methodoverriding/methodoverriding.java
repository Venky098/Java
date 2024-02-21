package com.java.methodoverriding;






class A{
    //@Override
    //method cannot be overridden from its superclass
    public void show(){
        System.out.println("show In A");
    }
    public void  print(){
        System.out.println("print In A");
    }
    public void  invoke(){
        System.out.println("invoke in  A");
    }
}
class B extends A {

    public void  show(){
        System.out.println("show In B");
    }

    //@Override //@override annotaion is used  to indicate a overridden method
    //if a same method is not present in parent class it will trow compilation error
    //method cannot be overridden from its superclass
    public void  invoked(){
       // super.show();
        System.out.println(" in  B");
    }
    @Override
    public void  invoke(){
        //super.show();
        //if we want to invoke superclass method we can use super.show();
        System.out.println("invoke in  B");
    }
}
public class methodoverriding {
public static void main(String[] args){
    A ob = new A();
    ob.show();
    B ob1 = new B();
    ob1.print();
    //as there is no such print method exists in class B , it calls from class A
    ob1.show();
    //as there are two method with same name and arguments in both the class .
    // the method in the extended class overrides  method of super class by default
    //to  determine from which class method to be picked is determined in runtime time itself
    //runtime time polymorphism
    ob1.invoke();
}
}
