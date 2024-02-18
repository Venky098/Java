package com.java.array;


class Student{
    int  roll;
    String Name;
    public void display(){
        System.out.println("Student class display method");
    }
}

public class basicArray {





    //Array : Collection of elements
    //every element in array have unique numbers called index which defines its position in the Array
    //index starts with '0'
    //we have to define the size of array


    public static void main(String[] args){
        int[] A = new int[3];
        //A is collection of int values of size 3
        A[0]=13;
        A[1]=12;
        A[2]=14;

        for(int b=0;b<3;b++){
            System.out.println(A[b]);
        }
        //Enhacned forloop
        for(int k:A){
            System.out.println(k);
        }


        Student s1 = new Student();
        Student s2 = new Student();
        Student s3= new Student();
        //created array of students
        Student[] studentarray = {s1,s2,s3};
        s1.Name="Mani";
        s2.Name="Raj";
        s3.Name ="Venkat";

        for(int b=0;b<3;b++){
            System.out.println(studentarray[b].Name);
        }


}
}
