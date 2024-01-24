package com.techquestsoft.training.misc;
// Java program to demonstrate working of Scanner in Java
import java.util.Scanner;


public class Adding2Numnbers {


        public static void main(String args[])
        {
            // Using Scanner for Getting Input from User
            Scanner in = new Scanner(System.in);

            /*String s = in.nextLine();
            System.out.println("Entered string " + s);
*/
            System.out.println("Enter First Number :  ");
            int a = in.nextInt();

            System.out.println("Entered Number is :  " + a);

            System.out.println("Enter Second Number :  ");
            float b = in.nextFloat();
            System.out.println("Entered Second is " + b);

            System.out.println(" Sum of First and Second number is :" + (a + b));
        }
    }

