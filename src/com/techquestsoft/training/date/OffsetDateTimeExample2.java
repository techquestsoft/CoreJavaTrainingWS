package com.techquestsoft.training.date;

import java.time.OffsetDateTime;
public class OffsetDateTimeExample2 {
    public static void main(String[] args) {
        OffsetDateTime offsetDT = OffsetDateTime.now();
        System.out.println(offsetDT.getDayOfYear());
    }
}