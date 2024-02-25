package com.java.accessmodifierdemo;



public class protecteddemo {
    public static void main(String[] args) {
        Sampleparent sp = new Sampleparent();
        System.out.println(sp.i);
        System.out.println(sp.name);
       sp.methodparent();
    }
}
