package com.techquestsoft.training.conversion;

//Java Program to demonstrate the use of Integer.parseInt() method
//for converting Octal to Decimal number
public class OctalToDecimalExample1{
    public static void main(String args[]){
//Declaring an octal number
        String octalString="121";
//Converting octal number into decimal
        int decimal=Integer.parseInt(octalString,8);
//Printing converted decimal number
        System.out.println(decimal);
    }}
