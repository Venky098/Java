package com.java.Inheritancedemo;


import java.lang.reflect.Array;
import java.util.Arrays;

class Calculator{                          //Super class,Parent,Base (the class which is being extended called super class in java )

    public int  addition(int ... args){
        int sum =0;
        for(int i:args){
            sum+=i;
        }
        return sum ;
    }


}
class Calculatorupdated extends Calculator{      //Subclass or childclass, Derived class ( the class that extends a class is called as subclass in java)
    //single level inheritance as this is only extension with single class
    //extends keyword is used to apply inheritance of other class.
    //all the attributes will be inherited to new class (Calculatorupdated).
    //redundancy in code can be minimised
    public int subtraction(int ... args){
        args = Arrays.stream(args).sorted().toArray();
//        System.out.println(Arrays.toString(args));
        int sub =args[args.length-1];
        for(int a:args){
            if(a!=args[args.length-1]){
                sub = sub-a;
            }

        }
        return sub;
    }

}

class Calculatoradvance extends Calculatorupdated{
    // an inherited class being inherited to other class called multi level inheritance

    public int  multiple(int ... args){
        int multi =1;
        for(int a:args){
            multi= multi*a;
        }
        return multi;
    }

}
public class Inheritancedemo {

    public static void main(String[] args){
        Calculator ob1 = new Calculator();
        System.out.println(ob1.addition(1,4,7));
        //

        Calculatorupdated ob2 = new Calculatorupdated();
        System.out.println(ob2.subtraction(1,4,6));
        System.out.println(ob2.addition(1,5,7,9));
        //by exetending the class we are able to access the method defined in super class from sub class through its object


        Calculatoradvance ob3 = new Calculatoradvance();
        System.out.println(ob3.multiple(3,4,1));
        System.out.println(ob3.addition(1,2,4));
        System.out.println(ob3.subtraction(4,2,1));


    }

}
