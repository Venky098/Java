package com.java.Wrapper;









public class wrapper {
    public static void main(String[] args) {
        int i =10;
        Integer integer1 = new Integer(i);//boxing wrapping
        int j =integer1.intValue(); //unboxing or unwrapping

        Integer val = j; //autoboxing
        int k = val; //autounboxing

        String str = "123.12";
        String sr1 ="123";
        int l = Integer.parseInt(sr1);//input of parseInt should be a string representation of a number
        System.out.println(l);

        Double n = Double.parseDouble(str);
        System.out.println(Double.parseDouble(str)+" "+Double.parseDouble("123"));
        }

}
