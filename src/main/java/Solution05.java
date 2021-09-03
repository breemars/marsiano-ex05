/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution05 {
    /*
    Compute basic calculation based on user's two numbers
    - input two numbers from user as ints
    - add, subtract, multiply, and divide the two numbers
    - output results
    */
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //IN - Input first number
        System.out.print("What is the first number? ");
        int first = input.nextInt();

        //IN - Input second number
        System.out.print("What is the second number? ");
        int second = input.nextInt();

        //calculations
        int add = first + second;
        int sub = first - second;
        int mult = first * second;
        int div = first / second;

        //OUT - prints out the results
        System.out.printf("%d + %d = %d \n%d - %d = %d \n%d * %d = %d \n%d / %d = %d", first, second, add, first, second, sub, first, second, mult, first, second, div);

    }

}
