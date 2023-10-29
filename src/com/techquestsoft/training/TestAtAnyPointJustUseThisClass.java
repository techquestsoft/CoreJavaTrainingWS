package com.techquestsoft.training;

public class TestAtAnyPointJustUseThisClass {
    public  static void main(String[] args){
        String a = new String("50");
        String b = a;
        System.out.println(a);
        System.out.println(b)  ;

        a = new String("500");
        //System.out.println(id(a));
        //System.out.println(id(b));
        System.out.println(a);
        System.out.println(b);
    }
}
