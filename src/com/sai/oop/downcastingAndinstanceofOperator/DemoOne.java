package com.sai.oop.downcastingAndinstanceofOperator;

class ParentClass {
    void introduce(){
        System.out.println("I am a parent class method");
    }
}

class ChildClass extends ParentClass {
    void convert(ParentClass sample){ //Upcaste
        if(sample instanceof ParentClass){
            sample = (ChildClass)sample; //Downcaste
            System.out.println("Downcasted successfully");
            System.out.println("Congratulations!! now you can access ParentClass and ChildClass members");
            sample.introduce();
        }
    }
}

public class DemoOne {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.convert(obj);
    }
}
