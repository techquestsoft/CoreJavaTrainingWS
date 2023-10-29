package com.techquestsoft.training.date;

import java.time.DayOfWeek;
public class DayOfWeekExample2 {
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.of(5);
        System.out.println(day.name());
        System.out.println(day.ordinal());
        System.out.println(day.getValue());
    }
}
