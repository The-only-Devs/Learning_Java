package com.sai.oop.finalExample;

class Customer{
//    This class demonstrates the blank final variable usecase

//    What is blank final variable?
//    A blank final variable is a variable which is not initialized while varable definition

//     Can we initialize blank final variable?
//    Yes, but only in constructor.
    private final long ADHARNUMBER;

    Customer(final long ADHARNUMBER){
        this.ADHARNUMBER = ADHARNUMBER;
        System.out.println(ADHARNUMBER);
    }
}

class Company{
//    This class demonstrates the static blank final variable usecase

//    What is blank final variable?
//    A static final variable that is not initialized at the time of declaration is known as static blank final variable.
//    It can be initialized only in static block not in constructor.

    private static final String COMPANYNAME;

    static{
        COMPANYNAME = "ABC";
        System.out.println(COMPANYNAME);
    }
}

//What is final parameter?
//You can declare any parameter of method as final. you cannot change the value of such final parameter.
//For example,
// class Calculator{
//  int cube(final int n){
//   //n=n+2;//can't be changed as n is final
//   return n*n*n;
//  }
// }



public class Demo {
    public static void main(String[] args) {
        Customer customer1 = new Customer(123456781234L);

        Company company1 = new Company();
    }
}
