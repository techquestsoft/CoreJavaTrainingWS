package com.techquestsoft.training.conversion;

public class StringToCharExample2{
    public static void main(String args[]){
        String s="hello";
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            System.out.println("char at "+i+" index is: "+c);
        }
    }}
