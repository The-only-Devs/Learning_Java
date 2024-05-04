package com.sai;

import java.awt.*;

public class Typecasting {
    public static void main(String[] args) {
//        Implicit Typecasting: smaller to larger(no data lost)
        int score = 25;
        float points = score;
        System.out.println(points);

//        Expilicit Typecasting: larger to smaller(data is lost.Hence, we need to convert forcefully)
        float length = 99.99F;
        int size = (int)length;
        System.out.println(size);
    }
}
