package com.java.Inheritancedemo;



class A {
    public void show(){
        System.out.println("in A");
    }
}
class B  {
    public void show(){
        System.out.println("in B");
    }
}
class C extends A{ //,B {
//class C extends A,B {

}
public class multipleinheritance {
    public static void main(String[] args){
        C ob = new C();
        ob.show();
        //if we assume  class  C support multiple inheritance
        //when we invoke show method through object of C which inherited both A,B leads to ambiguity
        ///due to which java doesnot support multiple inheritance directly
    }
}
