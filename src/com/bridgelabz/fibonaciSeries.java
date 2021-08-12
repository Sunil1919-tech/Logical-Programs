package com.bridgelabz;

import java.util.Scanner;
/**
        * fibonacciSeries is implementation for application that
        * produce fibonacci series for given input
        * prints the output on Screen
        *
        * @author Sunil
        * @version 16.0
        * @since 09/08/2021
        */
public class fibonaciSeries {
    /**
     * Ask User To Enter Number To Print Fibonacci Series
     */
    public static void main(String[] args) {
        int num1 = 0, num2 = 1, fibonacci, i, num3;
        System.out.println("Welcome to the fibonacci series program");
        //Enter how many numbers to print numbers in series
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print fibonacci series : ");
        fibonacci = sc.nextInt();
        System.out.print(num1 + " " + num2); //printing 0 and 1
        //for loop  to evaluating fibonacci series
        //loop starts from 2 because 0 and 1 are already printed
        for (i = 2; i < fibonacci; i++) {
            num3 = num2 + num1;
            System.out.print("  " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}