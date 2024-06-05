package com.sai;

import java.util.Arrays;

public class Varargs_AmbiguityInMethodOverloading {
    public static void main(String[] args) {
//        Method Overloading:
//        Same function name with different number of argments or datatypes of arguments.
        demo(1, 2, 3, 4, 4);
        demo("Sai", "Rahul", "Raj");

//        Ambiguity in Method Overloading in Variable Arguments(Varargs):
//        Ambiguity in Method Overloading in Variable Arguments(Varargs) is the situation when arguments are
//        empty. Hence the compiler gets confused.
//        For example if demo function is invoked like demo();
//        then complier will get confused to which function implementation of demo to be called

    }

    private static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    public static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
