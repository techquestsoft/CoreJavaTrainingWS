package com.techquestsoft.training.date;

import java.time.OffsetDateTime;
public class OffsetDateTimeExample5 {
    public static void main(String[] args) {
        OffsetDateTime offset = OffsetDateTime.now();
        OffsetDateTime value =  offset.minusDays(240);
        System.out.println(value);
    }
}