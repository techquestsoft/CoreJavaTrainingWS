package com.techquestsoft.training.date;

import java.time.OffsetTime;
public class OffsetTimeExample4 {
    public static void main(String[] args) {
        OffsetTime offset = OffsetTime.now();
        int s = offset.getSecond();
        System.out.println(s+ " second");
    }
}