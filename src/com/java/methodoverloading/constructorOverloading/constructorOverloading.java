package com.java.methodoverloading.constructorOverloading;



    class someactivity {

        int id;
        int rollno;
        String Name;

        someactivity(){
            id=0;
            rollno=0;
            Name ="Nothing";
        }
        someactivity(int a){
            id=a;
            rollno=0;
            Name ="Nothing";
        }
        someactivity(int a, int b){
            id=a;
            rollno=b;
            Name ="Nothing";
        }

        someactivity(int a , int b, String msg){
            id=a;
            rollno=b;
            Name =msg;
        }

        //constructor overloading
        //we should have multiple methods with same method name as class name and different parameters
        //constructoroverloading is subset of methodoverloading.
    }

public class constructorOverloading{
    public static void main(String[] args){
        someactivity sa = new someactivity();
        someactivity sa1 = new someactivity(1);
        someactivity sa2 = new someactivity(10,23);
        someactivity sa3 = new someactivity(12,14,"Venkat");
        //parameters we pass determine which constructor is being invoked.
        System.out.println("values of id is "+sa.id+" rollNo is  "+sa.rollno+" Name is "+sa.Name);
        System.out.println("values of id is "+sa1.id+" rollNo is  "+sa1.rollno+" Name is "+sa1.Name);
        System.out.println("values of id is "+sa2.id+" rollNo is  "+sa2.rollno+" Name is "+sa2.Name);
        System.out.println("values of id is "+sa3.id+" rollNo is  "+sa3.rollno+" Name is "+sa3.Name);




    }
}
