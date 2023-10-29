package com.techquestsoft.training.date;

// important important statements
import java.util.Date;
import java.util.Locale;
import java.text.DateFormat;
public class GetDateTimeInstanceExample
{
    // main method
    public static void main(String argvs[]) throws Exception
    {
// locale is French here.
        Locale lcl = Locale.FRENCH;
// creating an object of the class Date
        Date d = new Date();
// getting the instance by invoking the getDateTimeInstance(int, int, Locale) method
        DateFormat dFormat = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.LONG, lcl);
        String str = dFormat.format(d);
        System.out.println(str);
    }
}
