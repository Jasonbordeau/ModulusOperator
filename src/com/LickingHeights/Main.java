package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testOddness();
        keepContained();
    }

    public static void testOddness() {

        int positiveNumber;
        Scanner user;
        user = new Scanner(System.in);

        System.out.println("Enter a Positive Number");
        positiveNumber = user.nextInt();

        System.out.println("Number is odd: " + (positiveNumber % 2 != 0));
    }

    public static void keepContained() {

        int positiveNumber;
       Scanner user;
       user = new Scanner(System.in);

       System.out.println("Enter a Positive Number");
       positiveNumber = user.nextInt();

       System.out.println("Number contained is: " + (positiveNumber%8+5));


    }

}