package com.techquestsoft.training.date;

import java.time.LocalDate;
import java.time.Month;
public class MonthEnumExample5 {
    public static void main(String[] args) {
        Month month = Month.from(LocalDate.now());
        System.out.println("Total Number of days: "+month.length(true));
    }
}