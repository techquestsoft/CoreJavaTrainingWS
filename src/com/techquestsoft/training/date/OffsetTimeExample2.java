package com.techquestsoft.training.date;

import java.time.OffsetTime;
public class OffsetTimeExample2 {
    public static void main(String[] args) {
        OffsetTime offset = OffsetTime.now();
        int h = offset.getHour();
        System.out.println(h+ " hour");
    }
}