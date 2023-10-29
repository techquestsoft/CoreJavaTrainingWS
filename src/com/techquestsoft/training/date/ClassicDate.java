package com.techquestsoft.training.date;

public class ClassicDate {
    public static void main(String []args){
        //1st way:
        java.util.Date date=new java.util.Date();
        System.out.println(date);

        //2nd way:
        long millis=System.currentTimeMillis();
        java.util.Date date1=new java.util.Date(millis);
        System.out.println(date1);

    }
}
