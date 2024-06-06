package com.sai.oop.polymorphism;

class Phone{
    int modelId = 10;

    void on(){
        System.out.println("Phone is ON");
    }

    void buttons(){
        System.out.println("Use can operate Phone with buttons");
    }
}

class SmartPhone extends Phone{
    int modelId = 25;

    void on(){
        System.out.println("Phone is ON");
    }

    void touchScreen(){
        System.out.println("Use can operate SmartPhone with Touch Screen");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();
        System.out.println(obj.modelId); // 10
        obj.buttons();
        obj.on(); //Dynamic Method Dispatch or RunTime Polymorphism
////        obj.touchScreen();// Not allowed
//
////        SmartPhone obj = new Phone();
    }
}
