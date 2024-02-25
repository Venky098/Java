package com.java.Interfacedemo;




abstract class writer{
    abstract public void write();
}
// class writer{
//   public void write(){
//
//   }
// }
class Pen  extends writer {
    public void write(){
        System.out.println("method from Pen");
    }
}
class Pencil extends writer{
    public void write(){
        System.out.println("method from Pencil");
    }
}

class Kit1{
    public void writesomething(writer p){ //writesomething(Pen p)
        p.write();
    }
}
class Kit{
    public void writesomething(Pen p){
        p.write();
    }
}
public class interfacedemo {
    public static void main(String[] args) {
        Kit kit = new Kit();

        Pen p = new Pen();
        Pencil pe = new Pencil();
        kit.writesomething(p);
//        in order to writesomething
//        we need to have Pen object  if defined writesomething(Pen p)
//        if we want  to pass Pencil we need to define a method  writesomething(Pencil p)
//        instead of this we can create a super class write which have nothing and both Pen and Pencil extends writer
//        now we can define writesomething(writer p) which accepts both pencil and pen

        Kit1 dumk = new Kit1();
        dumk.writesomething(p);
        dumk.writesomething(pe);
//      now it will accept both objects

        dummywriter dP = new dummyPen();
        //reference can be created of an interface , and object of class
        // we cannot create object of an interface
        // we can create reference of an interface
        dummyPencil dPe = new dummyPencil();

        dummyKit1 dk1 = new dummyKit1();
        dk1.writesomething(dP);
        dk1.writesomething(dPe);
//        same implementation using interface keyword can be achieved when we extend single class
    }
}


interface  dummywriter{

    //interface is used to implement generalisation
    // we cannot create object of an interface
    // we can create reference of an interface
     public void dummmywrite();
     // if youre using interface , the classes implements the interface should define all the methods
    int i =7;
    //variable declared in interface is always final( final int i =7)
}

class dummyPen  implements  dummywriter {
//     we need to use implements
    public void dummmywrite(){
        System.out.println("implement method from Pen");
    }
}
class dummyPencil implements   dummywriter{
    public void dummmywrite(){
        System.out.println("implement method from Pencil");
    }
}

class dummyKit1{
    public void writesomething(dummywriter p){ //writesomething(Pen p)
        p.dummmywrite();

    }
}