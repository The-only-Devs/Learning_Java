package com.sai;

import java.awt.*;

public class Primitive_vs_Reference {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
        x = 50;
        System.out.println(x + " " + y);
//        Primitives
//        Cannot broken into smaller datatypes.
//        Copied by value.

//        Reference
//        Can be broken into smaller datatypes.
//        Copied by reference.
        Point pt1 = new Point(5, 5);
        Point pt2 = new Point(10, 10);
        pt1.x = 200;
        System.out.println(pt1 + " " + pt2);
    }
}
