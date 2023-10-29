package com.techquestsoft.training.date;

import java.time.LocalDate;
import java.time.Month;
public class MonthEnumExample2 {
    public static void main(String[] args) {
        Month month = Month.from(LocalDate.now());
        System.out.println(month.getValue());
        System.out.println(month.name());
    }
}
