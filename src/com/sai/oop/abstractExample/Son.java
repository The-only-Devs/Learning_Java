package com.sai.oop.abstractExample;

public class Son extends Parent{
    @Override
    void career() {
        System.out.println("I am a Doctor");
    }

    @Override
    void salary() {
        System.out.println("My salary is 30k");
    }

    @Override
    void hobby() {
        System.out.println("I read books");
    }
}
