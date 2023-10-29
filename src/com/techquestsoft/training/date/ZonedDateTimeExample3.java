package com.techquestsoft.training.date;

import java.time.ZonedDateTime;
public class ZonedDateTimeExample3{
    public static void main(String[] args) {
        ZonedDateTime zone =ZonedDateTime.now();
        System.out.println(zone.getZone());
    }
}
