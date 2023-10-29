package com.techquestsoft.training.date;

// important import statements

public class CurrentDateTimeExample6
{
    // main method
    public static void main(String[] argvs)
    {
        System.out.println(java.time.Clock.systemUTC().instant());
    }
}
