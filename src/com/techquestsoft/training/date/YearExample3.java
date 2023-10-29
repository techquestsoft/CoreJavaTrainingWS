package com.techquestsoft.training.date;

import java.time.Year;
public class YearExample3 {
    public static void main(String[] args) {
        Year year = Year.of(2017);
        System.out.println(year.length());
    }
}
