package com.techquestsoft.training.date;

import java.time.LocalDate;
import java.time.MonthDay;
public class MonthDayExample1 {
    public static void main(String[] args) {
        MonthDay month = MonthDay.now();
        LocalDate date = month.atYear(1994);
        System.out.println(date);
    }
}
