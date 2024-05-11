package com.sai.oop.staticKeyword;

class Book{
    private int id;
    private String name;
    static int bookCounter;

    static{
        bookCounter = 0;
    }
    Book(int id, String name){
        bookCounter++;
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println(this.id + this.name + bookCounter);
    }
}

public class BooksCounter {
    public static void main(String[] args) {
        Book book1 = new Book(1, "Phycology of Money");
        Book book2 = new Book(2, "System Design");
        Book book3 = new Book(3, "OOP in Java");

        book1.display();
        book2.display();
        book3.display();
    }
}
