package com.techquestsoft.training.date;

import java.time.Duration;
import java.time.LocalTime;
public class DurationExample4 {
    public static void main(String[] args) {
        Duration d1 = Duration.between(LocalTime.NOON,LocalTime.MAX);
        System.out.println(d1.getSeconds());
        Duration d2 = d1.minus(d1);
        System.out.println(d2.getSeconds());
    }
}
