package com.sai.oop.aggregationExample;

class Address{
    String city;
    String state;
    int pincode;

    public Address(String city, String state, int pincode){
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
}

public class Employee {
    private int id;
    private String name;
    private Address address;
// As we know that inheritance is a "IS-A" relationship.
// Similarly,Aggregation represents "HAS-A" relationship.
// Aggregation - HAS-A Relationship(When we use another object of different class in some other class)
// (For eg., Here we have used Address class object address inside Employee class)

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void getData(){
        System.out.println(this.id + this.name + this.address.city + this.address.state + this.address.pincode);
    }

    public static void main(String[] args) {
        Address add1 = new Address("Mumbai", "Maharashtra", 400534);
        Address add2 = new Address("Mumbai", "Maharashtra", 400037);

        Employee emp1 = new Employee(1, "Rahul", add2);
        Employee emp2 = new Employee(2, "Raj", add2);

        emp1.getData();
        emp2.getData();
    }
}
