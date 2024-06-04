package com.sai.oop.interfaceExample.nestedInterfaceExample;

class A{

    //nested interface
    public interface nestedInterface{
        void isOdd(int num);
    }
}
public class B implements A.nestedInterface{
    @Override
    public void isOdd(int num){
        System.out.println(((num & 1) == 1));
    }
}
