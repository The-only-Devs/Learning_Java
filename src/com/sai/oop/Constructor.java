package com.sai.oop;

public class Constructor {
    char letter;
    int num;
    String name;

//    Default Constructor:
    // Java automatically provides a default constructor
    // This default constructor initializes instance variables with default values
    // Default value for int is 0, and for String and other reference variable is null
    public static void main(String[] args) {
        Constructor cons = new Constructor();
        System.out.println(cons.letter);
        System.out.println(cons.num);
        System.out.println(cons.name);
    }
}
