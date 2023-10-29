package com.techquestsoft.training.date;

// important import statement

import java.util.TimeZone;

public class SetIDExample
{

    // main method
    public static void main( String argvs[] )
    {

// creating an object of the class TimeZone
        TimeZone tz = TimeZone.getDefault();

// setting the time zone ID
        tz.setID("GMT + 07:01");

// checking for the time zone ID
        System.out.println("The Time zone ID is: " + tz.getID());
    }
}
