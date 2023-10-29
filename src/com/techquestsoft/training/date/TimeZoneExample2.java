package com.techquestsoft.training.date;

import java.util.Calendar;
import java.util.TimeZone;
public class TimeZoneExample2 {
    public static void main( String args[] ){
        TimeZone zone = TimeZone.getTimeZone("Asia/Kolkata");
        System.out.println("The Offset value of TimeZone: " +
                zone.getOffset(Calendar.ZONE_OFFSET));
    }
}
