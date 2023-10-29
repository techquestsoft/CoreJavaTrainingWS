package com.techquestsoft.training.date;

import java.time.Period;
import java.time.YearMonth;
public class YearMonthExample5 {
    public static void main(String[] args) {
        YearMonth ym1 = YearMonth.now();
        YearMonth ym2 = ym1.minus(Period.ofYears(2));
        System.out.println(ym2);
    }
}
