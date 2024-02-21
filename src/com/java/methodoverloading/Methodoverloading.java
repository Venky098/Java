package com.java.methodoverloading;


import java.util.Arrays;

class casiocal {

    public void add(int a, int b) {
        System.out.println("sum of two integers " + (a + b));
    }

    public void add(double a, double b) {
        System.out.println("sum of two double values " + (a + b));
    }
    public void add(int[] args){
        System.out.println("sum of array  "+sum(args));
    }
    //method overloading
    //we should have multiple methods with same method name and different parameters
    //we have add method with two int params and add method with two double and add method with array of int values




    int sum(int[] args){
        return Arrays.stream(args).sum();
    }
}

public class Methodoverloading {
    public static void main(String[] args) {
        casiocal ob = new casiocal();
        ob.add(new int[]{1, 2, 3, 4});
        ob.add(3,4);
        ob.add(1.2,2);
        ob.add(2,3.4);
        ob.add(3.4,4.5);
        //methodoverloading is used when we have to perform similar type of actions(eg.additon) but with different set of inputs.
        //above example is to perform addition for  different set of arguements.
        //to  determine from which class method to be picked is determined in compile time itself
        //compile time polymorphism
    }
}
