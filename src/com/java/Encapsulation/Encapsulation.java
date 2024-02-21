package com.java.Encapsulation;



class Student{
    int rolllno;
    String name;
}

//Encapsulation - binding data with methods
class Employee{
    private int Empid;
    private String Empname;
    public String Company;

    //Use getters and setters
    public void setEmpname(String name){
        Empname = name;
    }
    public String getEmpname(){
        return Empname;
        //this way we restrict access to data (i.e Empid,Empname ) directly and provded access through getters and setters

    }

    public int getEmpid() {
        System.out.println("User accessed empid");//logger

         return Empid;
    }

    public void setEmpid(int empid) {
        System.out.println("User set empid");//logger
        //encapsulation hides actually data and provides a path to keep logger if necessary to track the usuage of data
        Empid = empid;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Student ob = new Student();
        ob.name ="Venkatesh";
        ob.rolllno =123;
        System.out.println("Name "+ ob.name + " roll no "+ ob.rolllno);
        //this is not best practice to access the variable of other class
        Employee ee = new Employee();
        ee.setEmpid(123);
//        ee.Empname ="Murali";
        ee.setEmpname("Murali");
        ee.setCompany("ABC company Ltd");
        System.out.println("Name " + ee.getEmpname() + " of company "+ ee.getCompany() + " his id "+ ee.getEmpid());
    }
}
