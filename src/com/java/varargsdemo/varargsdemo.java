package com.java.varargsdemo;



class Sum{

//    public int add(int i,int j )
    //In this way we have to change the method arguments whenever we want to increase the size of inputs
    public int add(int ...i){
        //...i represent an array of input
        //by defining this way we can pass any number of inputs based on our requirements
        int sum =0;
                for(int j:i){
                    sum = sum+j;
                }
        return sum;
    }
    public String fullname(String ... words){
        String word="";
        for(String a:words){
            word=word.concat(a)+" ";
        }
        return word;
    }
}
public class varargsdemo {
    public static void main(String[] args){
        Sum ob = new Sum();
        System.out.println(ob.add(1,3,5,7));
        System.out.println(ob.add(1,2));
        System.out.println("Full Name is "+ob.fullname("Venkatesh","Naidu","Y"));
    }
}
