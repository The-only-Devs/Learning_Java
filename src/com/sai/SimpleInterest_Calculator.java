package com.sai;

import java.util.Scanner;

public class SimpleInterest_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int principal = input.nextInt();
        System.out.print("Enter RateOfInterest: ");
        float rate = input.nextFloat();
        System.out.print("Enter Number of Years: ");
        int years = input.nextInt();

        final int DIVIDEND = 100;

        float simpleInterest = (principal*rate*years)/DIVIDEND;
        System.out.println("Your Simple Interest is: " + simpleInterest);
    }
}
