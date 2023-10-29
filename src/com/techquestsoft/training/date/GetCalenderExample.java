package com.techquestsoft.training.date;

// important import statements

import java.text.DateFormat;
public class GetCalenderExample
{
    // main method
    public static void main(String argvs[]) throws Exception
    {
// getting the instance
        DateFormat dFormat = DateFormat.getDateTimeInstance();
// invoking the method getCalender();
        System.out.println(dFormat.getCalendar());
    }
}
