package com.java.constructor;


class cal{
    int i;
    int b;
    int result;


    void perform() {
        result = i+b;
    }

    public cal() {
        i=1;
        System.out.println("default constructor") ;
    }

    public cal(int re) {

        System.out.println("defined constructor") ;
        //it will be used to allocate memory
        //it will not return anything
        //it will be of same name of class
        //it is a member method
        //it will be called when object is created.
    }

}
public class ConstructorObjectdemo {
    public static void main(String[] args) {
        cal ob = new cal();
        ob.i=2;
        ob.b=3;
        System.out.println("result is "+ob.result) ;
        ob.perform();
        System.out.println("result"+ob.result);


    }
}

