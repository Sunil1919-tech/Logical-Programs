package com.bridgelabz;

import java.util.Scanner;
/**
        * reverseNum is a Implementation for application that
        * print reverse order of given number
        * prints the output on Screen
        *
        * @author Sunil
        * @version 16.0
        * @since 09/08/2021
        */

public class reverseNum {

    /*
     * Ask User To Enter a Number
     * And Write Condition To Print Reverse Number
     */
    public static void main(String[] args) {
        int num, reminder, reverse = 0;
        //Welcome message added
        System.out.println("The program to find Revrese of given Number");
        //Ask user to enter a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        num = sc.nextInt();
        //While condition for to print the reverse number
        while (num != 0) {

            reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num = num / 10;
        }
        System.out.println("The Reverse number is :" + reverse);
    }
}