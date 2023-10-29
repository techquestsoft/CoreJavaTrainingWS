package com.techquestsoft.training.date;

// important import statements

public class CurrentDateTimeExample10
{
    // main method
    public static void main(String[] argvs)
    {
        long millis=System.currentTimeMillis();

        // creating a new object of the class Date
        java.sql.Date date = new java.sql.Date(millis);
        System.out.println(date);


    }
}
