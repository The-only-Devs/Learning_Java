package com.sai;

import java.util.Scanner;

public class ControlFlow_Pass_Quit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String val = "";

//        In Reference Datatypes,
//        if val=="pass" address of reference variables are compared not value.
//        Hence, we use val.equals("pass")
        while(true){ //Infinite loop
            System.out.print("Input: ");
            val =  input.next();
            if(val.toLowerCase().equals("pass"))  continue;
            if(val.toLowerCase().equals("quit")) break;
            System.out.println(val);
        }
    }
}
