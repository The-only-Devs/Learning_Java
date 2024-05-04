package com.sai;

public class Shadowing {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x); //10
        int x = 50;
        System.out.println(x); //50
        print1(x);
        print2();
    }

    public static void print1(int x) {
        System.out.println(x); //50
    }

    public static void print2(){
        System.out.println(x); //10
    }
}
