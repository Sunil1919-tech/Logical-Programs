package com.bridgelabz;

import java.util.Scanner;

/**
        * perfectNum is implementation for application that
        * generates perfect Numbers
        * prints the output on Screen
        *
        * @author Sunil
        * @version 16.0
        * @since 09/08/2021
        */
public class perfectNum {

    /**
     * Ask user To Enter a Number
     * And Check It Is a Perfect Number Or Not
     */
    public static void main(String[] args) {
        {
            int num, sum = 0;
            System.out.println("Welcome to the perfect number checking program ");
            //Ask user to enter the number
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number: ");
            num = sc.nextInt();
            int i = 1;
            //While loop to checking perfect number
            while (i <= num / 2) {
                if (num % i == 0) {
                    //calculates the sum of factors
                    sum = sum + i;
                }
                i++;
            }
            if (sum == num) {
                //print if sum and n are equal
                System.out.println(num + " is a perfect number.");
            } else
                //print if sum and n are not equal
                System.out.println(num + " is not a perfect number.");
        }
    }
}