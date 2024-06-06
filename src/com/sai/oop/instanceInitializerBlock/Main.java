package com.sai.oop.instanceInitializerBlock;

class Parent{
    Parent(){
        System.out.println("Parent Class constructor invoked");
    }
}

class Child extends Parent{
    Child(){
        super();
        System.out.println("Child Class constructor invoked");
    }

//    Instance Initializer block
    {
        System.out.println("You are in Instance Initializer block ONE");
    }
//    Instance Initializer block
    {
        System.out.println("You are in Instance Initializer block TWO");
    }
}
public class Main {
//    Instance Initializer block is used to initialize the instance data member.
//    It run each time when object of the class is created.

//    What is invoked first, instance initializer block or constructor?
//    In the above example, it seems that instance initializer block is firstly invoked but NO.
//    The java compiler copies the instance initializer block in the constructor after the first statement super().
//    So firstly, constructor is invoked.
//    The instance initializer block is invoked after the parent class constructor is invoked (i.e. after super() constructor call).

//    The instance initializer block comes in the order in which they appear.

    public static void main(String[] args) {
        Child instance = new Child();
    }
}
