package com.techquestsoft.training.conversion;

public class IntToCharExample6{
    public static void main(String args[]){
        int REDIX=16;//redix 16 is for Hexadecimal value
        int a=10;
        char c=Character.forDigit(a,REDIX);
        System.out.println(c);
    }}
