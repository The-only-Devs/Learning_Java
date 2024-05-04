package com.sai;

import java.util.Scanner;

public class SimpleInterest_FunctionalProgramming {
    public static void main(String[] args) {
//        Very Smartly we have written a function that
//        validates input returns double and typecast it  into any datatype according to our need.
        int principal = (int)giveValue("Enter Principal(1000 - 1000000): ", 1000, 1000000);
        float rate = (float)giveValue("Enter Rate of Interest(1 - 50): ", 1, 50);
        int years = (int)giveValue("Enter Number of Years(1 - 50): ", 1, 50);

        float simpleInterest = calculateSimpleInterest(principal, rate, years);

        System.out.println("Simple Interest: " + simpleInterest);
    }

    public static double giveValue(String prompt, int mini, int maxi) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(prompt);
        double val = scanner.nextDouble();
        while((val<mini) || (val>maxi)){
            System.out.println("Please enter a Value between" + mini + " and " + maxi);
            System.out.print(prompt);
            val = scanner.nextDouble();
        }
        return val;
    }

    public static float calculateSimpleInterest(int principal, float rate, int years) {
        final int DIVIDEND = 100;
        float ans = (principal*rate*years)/DIVIDEND;
        return ans;
    }
}
