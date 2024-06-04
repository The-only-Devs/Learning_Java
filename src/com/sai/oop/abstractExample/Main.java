package com.sai.oop.abstractExample;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.setAge(23);

        Daughter daughter = new Daughter();
        daughter.setAge(25);

        son.career();
        son.hobby();
        son.salary();

        daughter.career();
        daughter.hobby();
        daughter.salary();
    }
}
