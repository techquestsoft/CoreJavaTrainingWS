package com.techquestsoft.training.date;

import java.time.Duration;
import java.time.Instant;
public class InstantExample4 {
    public static void main(String[] args) {
        Instant inst1 = Instant.parse("2017-02-03T11:25:30.00Z");
        Instant inst2 = inst1.plus(Duration.ofDays(125));
        System.out.println(inst2);
    }
}
