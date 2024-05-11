package com.sai.oop.singletonClass;

class Singleton{
    private static Singleton instance;

    private Singleton(){
    }

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}

public class SingletonClass {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
//        obj1, obj2, obj3 are the 3 objects pointing to the same object created in heap memory
    }
}
