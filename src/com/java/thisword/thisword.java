package com.java.thisword;


class cal{
    int a;
    int b;
    int result;
    cal(){
        a=1;
        b=1;
        System.out.println("Default constructor");
    }
    cal(int a,int b){
        this.a =a ;
        this.b= b;
        System.out.println("int Parametered  constructor");
    }
    cal(float a, float b){
        this.a = (int) a;
        this.b =(int) b;
        System.out.println("float parametered constrcutor");
    }
    void perform(){
        result = a+b;
    }

}


public class thisword {

    public static void main(String[] args){
        cal ob = new cal();
        ob.perform();
        System.out.println(ob.result);
    }

}

