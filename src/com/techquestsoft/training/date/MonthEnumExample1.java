package com.techquestsoft.training.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;
public class MonthEnumExample1 {
    public static void main(String[] args) {
        Month month = Month.valueOf("January".toUpperCase());
        System.out.printf("For the month of %s all Sunday are:%n", month);
        LocalDate localdate = Year.now().atMonth(month).atDay(1).
                with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));
        Month mi = localdate.getMonth();
        while (mi == month) {
            System.out.printf("%s%n", localdate);
            localdate = localdate.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
            mi = localdate.getMonth();
        }
    }
}
