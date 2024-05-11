package com.sai.oop.staticKeyword;

class Student{
    private int id;
    private String name;
    static String clgName;

    static{
        clgName = "ABC";
    }
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(this.id + this.name + clgName); //We can''t do this.clgName
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Student std1 = new Student(101, "Sai");
        Student std2 = new Student(102, "Raj");

        std1.display();
        std2.display();

        Student.clgName = "XYZ";

        std1.display();
        std2.display();
    }
}
