package com.techquestsoft.training.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
public class DayOfWeekExample5
{
    public static void main(String ar[])
    {
        LocalDate localDate = LocalDate.of(2021, Month.SEPTEMBER, 13);
        DayOfWeek dayOfWeek = DayOfWeek.from(localDate);
        System.out.println("Day of the Week on" + " 13th September 2021 - " + dayOfWeek.name());
        int val = dayOfWeek.getValue();
        System.out.println("Int Value of " + dayOfWeek.name() + " - " + val);
    }
}
