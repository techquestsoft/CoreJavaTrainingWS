package com.techquestsoft.training.date;

// important important statements

import java.text.DateFormat;
import java.util.Date;

public class GetDateInstanceExample
{
    // main method
    public static void main(String argvs[]) throws Exception
    {

// creating an object of the class Date
        Date d = new Date();

// getting the instance by invoking the getDateInstance(int) method
// here default locale is used
        DateFormat dFormat = DateFormat.getDateInstance(DateFormat.SHORT);

        String str = dFormat.format(d);
        System.out.println(str);
    }
}
