package com.techquestsoft.training.date;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
public class YearMonthExample2 {
    public static void main(String[] args) {
        YearMonth ym = YearMonth.now();
        String s = ym.format(DateTimeFormatter.ofPattern("MM yyyy"));
        System.out.println(s);
    }
}
