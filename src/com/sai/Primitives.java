package com.sai;

public class Primitives {
    public static void main(String[] args) {
        byte age = 22;
        short score = 8_000;
        int pincode = 400009;
        long stockPrice = 2_00_00_00_000L; // OR 2_00_00_00_000l
        float price = 115.29F; // OR 115.29f
        double area = 2_55_78_850.78;
        char letter = 'a';
        boolean isLogin = true;

        final float PI = 3.14F;

//        If we want to use inbuilt fuctions for Primitive Datatypes we can use Wrapper class
        Integer userID = 25;

        int ascii = 'a';
        System.out.println(ascii); //97

//        Keep in mind that primitive types like int are autoboxed into their
//        corresponding wrapper classes when you call getClass() on them.
//        So, int becomes Integer.
        Integer value = 10;
        String name = "Myname";

        System.out.println("Type of 'value': " + value.getClass().getSimpleName());
        System.out.println("Type of 'name': " + name.getClass().getSimpleName());
    }
}
