package com.techquestsoft.training.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
public class DayOfWeekExample1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2017, Month.JANUARY, 25);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        System.out.println(dayOfWeek.get(ChronoField.DAY_OF_WEEK));
    }
} 
