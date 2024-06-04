package com.sai.oop.abstractExample;

public abstract class Parent {
    private int age;

    void setAge(int age){
        this.age = age;
    }

    abstract void career();
    abstract void hobby();
    abstract void salary();
}
