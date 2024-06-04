package com.sai.oop.interfaceExample;

public class ElectircEngine implements Engine{
    @Override
    public void start(){
        System.out.println("I start like a ELECTRIC ENGINE");
    }

    @Override
    public void stop(){
        System.out.println("I stop like a ELECTRIC ENGINE");
    }

    @Override
    public void accelerate(){
        System.out.println("I accelerate like a ELECTRIC ENGINE");
    }
}
