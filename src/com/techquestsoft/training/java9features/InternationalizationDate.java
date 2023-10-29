package com.techquestsoft.training.java9features;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class InternationalizationDate {

    static void printDate(Locale locale) {
        DateFormat formatter = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        Date currentDate = new Date();
        String date = formatter.format(currentDate);
        System.out.println(date + " " + locale);
    }

    public static void main(String[] args) {
        printDate(Locale.UK);
        printDate(Locale.US);
        printDate(Locale.FRANCE);
    }
}
