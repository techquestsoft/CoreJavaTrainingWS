package com.techquestsoft.training.date;

// important import statements

import java.text.DateFormat;
import java.text.NumberFormat;

public class GetNumberFormatExample
{
    // main  method
    public static void main(String[] argvs)
    {

// getting the instance by invoking the getTimeInstance() method
        DateFormat dFormat = DateFormat.getTimeInstance(DateFormat.SHORT);

// invoking the method getNumberFormat()
        NumberFormat numFormat = dFormat.getNumberFormat();

        System.out.println("The format is: " + numFormat);

    }
}
