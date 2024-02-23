package com.java.abstractdemo;


//abstract can be used for a method and class.
//abstract method canot be present in a non abstract-class.
//abstract class cannot be instantiated directly .
//It can be instantiated through the extended class and with any reference(Super or sub class)
//Class 'Man' must either be declared abstract or implement abstract method 'walk()' in 'Human'
//we need abstract class where the Parent class cannot declare the functionality of each subclass in common.
//it provides pathway to define its  specific functionality  to the subclasses.




abstract class Human{
    public void talk(){
        System.out.println("Human can talk");
    }
    abstract public void walk();
}
class Man extends Human{
    public void walk(){
        System.out.println("Man can walk");
    }
    @Override
    public void talk(){
        System.out.println("Man can talk");
    }
}

class Woman extends Human{
    public void walk(){
        System.out.println("Woman can walk");
    }
//    @Override
//    public void talk(){
//        System.out.println("Man can talk");
//    }
}

public class abstractdemo {
    public static void main(String[] args) {
//        Human human = new Human();
//        human.talk();

        Human human = new Man();
        human.talk();
        human.walk();
        Human human1 = new Woman();
        human1.talk();
        human1.walk();

    }
}
