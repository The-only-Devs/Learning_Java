package com.sai.oop.abstractExample;

public class Daughter extends Parent{
    @Override
    void career() {
        System.out.println("I am a Coder");
    }

    @Override
    void salary() {
        System.out.println("My salary is 50k");
    }

    @Override
    void hobby() {
        System.out.println("I play Tennis");
    }
}
