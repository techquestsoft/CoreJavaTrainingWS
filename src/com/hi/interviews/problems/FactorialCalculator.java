package com.hi.interviews.problems;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        long factorial = 1;  // Initialize factorial to 1

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial *= i;  // Multiply factorial by each number from 1 to num
            }
            System.out.println("The factorial of " + num + " is " + factorial);
        }
    }
}
