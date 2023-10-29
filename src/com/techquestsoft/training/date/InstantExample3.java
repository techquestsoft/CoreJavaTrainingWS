package com.techquestsoft.training.date;

import java.time.Duration;
import java.time.Instant;
public class InstantExample3 {
    public static void main(String[] args) {
        Instant instant = Instant.parse("2017-02-03T11:25:30.00Z");
        instant = instant.minus(Duration.ofDays(125));
        System.out.println(instant);
    }
}
