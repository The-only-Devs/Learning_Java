package com.sai.oop.interfaceExample.defaultExample;

public class Main implements A,B{
    @Override
    public void funcB(){
        System.out.println("Function B");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.funcB();
        obj.funcA();
    }
}
