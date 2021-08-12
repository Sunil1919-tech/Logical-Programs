package com.bridgelabz;

import java.util.Scanner;

/**
        * primeNum is implementation for application that
        * produce perfect prime numbers
        * prints the output on Screen
        *
        * @author Sunil
        * @version 16.0
        * @since 09/08/2021
        */
public class primeNum {
    /*
     *Ask User To Enter a Number
     *And Write Condition To Check The Number Is Prime Or Not
     *Print The Result
     */
    public static void main(String[] args) {
        int i, m = 0, num, g = 0;
        //Welcome to the prime number checking program
        System.out.println("Welcome to prime number program");
        //Ask user to enter the number for checking
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number  : ");
        num = sc.nextInt();
        //Condition for checking prime number
        m = num / 2;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number");
                    g = 1;
                    break;
                }
            }
            if (g == 0) {
                System.out.println(num + " is a prime number");
            }
        }

    }
}