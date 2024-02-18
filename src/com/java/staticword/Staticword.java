package com.java.staticword;


class Emp{
    int Eid;
    int Salary;
    String CEO;
    //memory allocation happens in heap space along with Eid and Salary variables
    void show(){
        System.out.println("Employee id is "+Eid+" Salary is "+Salary+" Company CEO is "+ CEO);
    }

}
class dummyEmp{
    int Eid;
    int Salary;
    //variables load whenever object is created
    static String CEO;
    //static variable is same for all the objects irrespective of  through which object it is called
    //static variable (CEO) is loaded when class is loaded
    static {
    CEO= "Carry";
    }
    static void prin(){
        System.out.println(CEO);
    }
    static void prin(String a){
        CEO=a;
        System.out.println(CEO);
    }
    //static methods can be overloaded but cant be overriden

    void dummyshow(){
        prin();
        //static method can be called without creation of object directly through Class
        System.out.println("Employee id is "+Eid+" Salary is "+Salary+" Company CEO is "+ CEO);
    }

}
public class Staticword {
    static int i =1;
    public static void main(String[] args){
        i=2;
        Emp ven = new Emp();
        ven.Eid =112;
        ven.Salary = 1200000;
        ven.CEO = "Nick";
        ven.show();
        Emp diesel = new Emp();
        diesel.Eid =113;
        diesel.Salary=1300000;
        diesel.CEO ="Nick";
        diesel.show();
        //calling a class specific variable which doesnot change with respective to object without static keyword

        dummyEmp ven1 = new dummyEmp();
        ven1 .Eid=112;
        ven1 .Salary = 1200000;
        ven1 .dummyshow();
        ven1 .CEO ="NICK CARRY";
        ven1 .dummyshow();

        dummyEmp diesel1 = new dummyEmp();
        diesel1.Eid =113;
        diesel1.Salary=1300000;
        dummyEmp.prin("MARK JUNK");
        dummyEmp.CEO ="MARK JUNK FROM LAST";
        diesel1.dummyshow();

    }
    // method or variables are executed in the order they are present in the code/program

}
