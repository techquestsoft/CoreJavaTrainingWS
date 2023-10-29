package com.techquestsoft.training.date;

import java.util.TimeZone;
public class TimeZoneExample3 {
    public static void main( String args[] ){
        TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata");
        System.out.println("Value of ID is: " + timezone.getID());
    }
}
