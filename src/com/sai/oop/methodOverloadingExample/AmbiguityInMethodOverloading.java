package com.sai.oop.methodOverloadingExample;

//class Adder{
//    static int add(int a,int b){return a+b;}
//    static double add(int a,int b){return a+b;}
//}

//class Summer{
//    static void sum(int a,long b){System.out.println("a method invoked");}
//    static void sum(long a,int b){System.out.println("b method invoked");}
//}

public class AmbiguityInMethodOverloading {
        public static void main(String[] args){
//            System.out.println(Adder.add(11,11));
            //ambiguity: compiler will get confused which function definition must be invoked

//            Summer.sum(11, 12);
            //ambiguity: compiler will get confused which function definition must be invoked
        }
}
