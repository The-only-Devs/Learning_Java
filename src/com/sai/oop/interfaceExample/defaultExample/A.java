package com.sai.oop.interfaceExample.defaultExample;

public interface A {
    default void funcA(){
        System.out.println("This is the default implementation of functionA. You can override me. If you don't override Thus implementation will execute");
    }
}
