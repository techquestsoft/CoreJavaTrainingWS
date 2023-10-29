package com.techquestsoft.training.date;

import java.time.Duration;
import java.time.LocalTime;
public class DurationExample2 {
    public static void main(String[] args) {
        Duration d1 = Duration.between(LocalTime.MAX,LocalTime.NOON);
        System.out.println(d1.isNegative());
        Duration d2 = Duration.between(LocalTime.NOON,LocalTime.MAX);
        System.out.println(d2.isNegative());
    }
}