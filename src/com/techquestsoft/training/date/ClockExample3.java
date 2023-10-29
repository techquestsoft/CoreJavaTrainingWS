package com.techquestsoft.training.date;

import java.time.Clock;
public class ClockExample3 {
    public static void main(String[] args) {
        Clock c = Clock.systemUTC();
        System.out.println(c.instant());
    }
}
