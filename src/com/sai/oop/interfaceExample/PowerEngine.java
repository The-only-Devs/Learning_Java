package com.sai.oop.interfaceExample;

public class PowerEngine implements Engine{
    @Override
    public void start(){
        System.out.println("I start like a POWER ENGINE");
    }

    @Override
    public void stop(){
        System.out.println("I stop like a POWER ENGINE");
    }

    @Override
    public void accelerate(){
        System.out.println("I accelerate like a POWER ENGINE");
    }
}