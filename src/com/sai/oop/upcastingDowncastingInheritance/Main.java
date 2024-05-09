package com.sai.oop.upcastingDowncastingInheritance;

public class Main {
    public static void main(String[] args) {
        TextBox textBox = new TextBox();
        UIControl control = new UIControl();
        display(textBox);
        display(control);
    }

//    Upcasting => Casting an object into Parent class.
//    Downcasting => Casting an object into Child class.
//    (1)
//    Every Child class object is of Parent class type(We can upcaste).
//    But every Parent class object is not necessarily of Child class type(We cannot downcaste).
//    (Similar to Set Theory: Child class is a subset of Parent class)

//    (2)
//    Child class object can access the properties of Parent class.
//    But Parent class object can't access the properties of Child class.
    static void display(UIControl obj){
        if(obj instanceof TextBox){
            var textBox = (TextBox)obj;
            System.out.println("Code is working");
        }
        System.out.println(obj);
    }
}
