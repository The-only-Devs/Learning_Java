package com.sai.oop.downcastingAndinstanceofOperator;

interface Printable{}

class One implements Printable{
    void oneMethod(){
        System.out.println("One Method");
    }
}

class Two implements Printable{
    void twoMethod(){
        System.out.println("Two Method");
    }
}

class Call{
    void invoke(Printable obj){
        if(obj instanceof One){
            One obj1 = (One)obj;
            obj1.oneMethod();
//      //      ((One) obj).oneMethod(); // We can also do in this way
        }

        if(obj instanceof Two){
            Two obj2 = (Two)obj;
            obj2.twoMethod();
        }
    }
}

public class DemoTwo {
    public static void main(String[] args) {
        Printable p1 = new One();
        Printable p2 = new Two();

        Call c = new Call();
        c.invoke(p1);
        c.invoke(p2);

    }
}
