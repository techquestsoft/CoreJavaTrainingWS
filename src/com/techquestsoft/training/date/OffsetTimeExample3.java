package com.techquestsoft.training.date;

import java.time.OffsetTime;
public class OffsetTimeExample3 {
    public static void main(String[] args) {
        OffsetTime offset = OffsetTime.now();
        int m = offset.getMinute();
        System.out.println(m+ " minute");
    }
}
