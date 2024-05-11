package com.sai.oop.staticKeyword;

class OuterClass1{
    static class InnerClass{
        String name;

        InnerClass(String name){
            this.name = name;
        }
    }
}
public class StaticInnerClass {

    public static void main(String[] args) {
        OuterClass1.InnerClass inner1 = new OuterClass1.InnerClass("Sai");
        OuterClass1.InnerClass inner2 = new OuterClass1.InnerClass("Rahul");

        System.out.println(inner1.name); //Sai
        System.out.println(inner2.name); //Rahul
    }
}
