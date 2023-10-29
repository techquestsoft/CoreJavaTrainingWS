package com.techquestsoft.training.date;

import java.time.ZoneOffset;
public class ZoneOffsetExample3 {
    public static void main(String[] args) {
        ZoneOffset zone = ZoneOffset.ofHoursMinutes(5,30);
        System.out.println(zone);
    }
}
