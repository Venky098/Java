package com.java.Exceptiondemo;


//unchecked Exceptions - runtimeExceptions
public class Exceptiondemo {
    public static void main(String[] args) {
        try {
            int j =1;
            int i = 9 / 1;  //    9/0 throws  ArithmeticException
            int[] a = new int[2];
//             a[5] = 5;
            System.out.println(a[3]);
           // System.out.println("Abc");
//        /0 throws an exception , so we need to handle all exceptions using try catch
//            can write multiple catch blocks.
        }catch (ArithmeticException e){
            System.err.println("Caught Arithmetic Exception ");
            //System.out.println("Abc");
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Check your storage limit");
        }catch (NullPointerException e){
            System.err.println("you passed null value ");
        }catch (Exception e){
            System.err.println(" Exception"+ e.getMessage());
        }
        finally {
            System.out.println("Abc");
        }//we use finally when we want to execute a piece of code irrespective of occurrence of exception
    }
}
