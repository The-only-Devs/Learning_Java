package com.sai.oop.staticKeyword;

class OuterClass {
    // Outer class members and methods

    class InnerClass {
        // Inner class members and methods
        InnerClass(){
            System.out.println("Inner Constructor called successfully");
        }
    }
}

public class NonStaticInnerClass {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
//        The syntax for creating the object of the inner class is outerObj.new InnerClass(),
//        where outerObj is an instance of the outer class.
        // Now you can use innerObj as needed
    }
}



