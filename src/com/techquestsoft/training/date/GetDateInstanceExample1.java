package com.techquestsoft.training.date;

// important important statements

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
public class GetDateInstanceExample1
{
    // main method
    public static void main(String argvs[]) throws Exception
    {
// locale is French here.
        Locale lcl = Locale.FRENCH;

// creating an object of the class Date
        Date d = new Date();

// getting the instance by invoking the getDateInstance(int, Locale) method
        DateFormat dFormat = DateFormat.getDateInstance(DateFormat.SHORT, lcl);

        String str = dFormat.format(d);
        System.out.println(str);
    }
}