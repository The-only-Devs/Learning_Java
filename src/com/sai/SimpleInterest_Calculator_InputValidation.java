package com.sai;

import java.util.Scanner;

public class SimpleInterest_Calculator_InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final short DIVIDEND = 100;

        System.out.print("Enter Principal(1000 - 1000000): ");
        int principal = scanner.nextInt();
        while((principal<1000) || (principal>1000000)){
            System.out.println("Enter a Value between 1000 and 1000000");
            System.out.print("Enter Principal(1000 - 1000000): ");
            principal = scanner.nextInt();
        }

//        You can also use Infinite loop here
//        int principal = 0;
//        while(true){
//            System.out.print("Enter Principal(1000 - 1000000): ");
//            principal = scanner.nextInt();
//            if((principal<1000) || (principal>1000000)){
//                System.out.println("Enter a Value between 1000 and 1000000");
//                continue;
//            }
//            if(((principal>=1000) && (principal<=1000000))){
//                break;
//            }
//        }

        System.out.print("Enter Rate of Interest(1 - 50): ");
        float rate = scanner.nextFloat();
        while((rate<1) || (rate>50)){
            System.out.println("Enter a Value between 1 and 50");
            System.out.print("Enter Rate of Interest(1 - 50): ");
            rate = scanner.nextFloat();
        }

        System.out.print("Enter Number of Years(1 - 50): ");
        int years = scanner.nextInt();
        while((years<1) || (years>50)){
            System.out.println("Enter a Value between 1 and 50");
            System.out.print("Enter Number of Years(1 - 50): ");
            years = scanner.nextInt();
        }

        float simpleInterest = (float)((principal*rate*years)/DIVIDEND);

        System.out.println("Simple Interest: " + simpleInterest);
    }
}
