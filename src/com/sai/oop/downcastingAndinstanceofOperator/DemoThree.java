package com.sai.oop.downcastingAndinstanceofOperator;

public class DemoThree {
    public static void main(String[] args) {
        DemoThree demo = null;
        System.out.println(demo instanceof DemoThree);//false
//        Important Learning:
//        If we apply the instanceof operator with any variable that has null value, it returns false.
    }
}
