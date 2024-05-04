package com.sai;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.print("one");
        System.out.print("two");
        System.out.print("three");
//        onetwothree

        System.out.println();
        System.out.println("one");
        System.out.println("two");
        System.out.println("three");
//        one
//        two
//        three

        Scanner input =  new Scanner(System.in);
        int age = input.nextInt();
//        String firstWord = input.next();
//        String sentence = input.nextLine();
//        float price = input.nextFloat(); // And Much more
        System.out.println(age);

//        int x;
//        System.out.println(x);// Cannot access before initialization
    }
}
