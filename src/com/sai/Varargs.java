package com.sai;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
//    Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments.
//    Similar to Rest and Spread in Javascript.
//      Note:
//    Vararg Methods can also be overloaded, but overloading may lead to ambiguity.
//    There can be only one Vararg in a method.
//    Variable argument (Vararg) must be the last argument.

        func();
        func(1, 2, 3, 4, 5);
        multiple(10, 20, "Sai", "Rahul");
    }

    public static void func(int ...intVarargs) {
        System.out.println(Arrays.toString(intVarargs));
    }

    public static void multiple(int a, int b, String ...stringVarargs) {
        System.out.println(a + b + Arrays.toString(stringVarargs));
    }
}
