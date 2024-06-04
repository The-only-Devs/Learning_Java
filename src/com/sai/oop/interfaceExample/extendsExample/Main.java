package com.sai.oop.interfaceExample.extendsExample;

public class Main implements A,B{
    @Override
    public void funcA(){
        System.out.println("funcA Overrided");
    }

    @Override
    public void funcB(){
        System.out.println("funcB Overrided");
    }
}
