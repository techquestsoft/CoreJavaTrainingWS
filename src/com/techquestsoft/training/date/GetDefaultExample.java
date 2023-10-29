package com.techquestsoft.training.date;

// important import statement

import java.util.TimeZone;

public class GetDefaultExample
{
    // main method
    public static void main(String[] argvs)
    {
// invoking the getDefault() Method
        TimeZone zone = TimeZone.getDefault();
        System.out.println("The ID of the default TimeZone is: " + zone.getID());

    }
}
