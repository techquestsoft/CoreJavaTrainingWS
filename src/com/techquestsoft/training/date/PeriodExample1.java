package com.techquestsoft.training.date;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
public class PeriodExample1 {
    public static void main(String[] args) {
        Period period = Period.ofDays(24);
        Temporal temp = period.addTo(LocalDate.now());
        System.out.println(temp);
    }
}
