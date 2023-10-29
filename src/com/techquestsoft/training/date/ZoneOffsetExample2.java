package com.techquestsoft.training.date;

import java.time.ZoneOffset;
public class ZoneOffsetExample2 {
    public static void main(String[] args) {
        ZoneOffset zone = ZoneOffset.ofHours(5);
        System.out.println(zone);
    }
}