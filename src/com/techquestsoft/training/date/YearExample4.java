package com.techquestsoft.training.date;

import java.time.Year;
public class YearExample4 {
    public static void main(String[] args) {
        Year year = Year.of(2016);
        System.out.println(year.isLeap());
    }
}