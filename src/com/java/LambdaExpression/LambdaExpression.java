package com.java.LambdaExpression;





@FunctionalInterface // if we define with @FunctionalInterface should  have only one abstract method
interface  A1{
    public void show();
}
public class LambdaExpression {
    public static void main(String[] args) {
        A a = new A(){ public void show(){ System.out.println("print from anonymous class A "); } };
        A a1 = ()-> System.out.println("print from anonymous class A ");//lambda Expression
        //as we know A is an functional interface which have only one method show
        // so we can imagine which object we are creating and which method we are using so we can remove "new A(){ public void show"
        }
    }
