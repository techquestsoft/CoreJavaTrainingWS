package com.techquestsoft.training.date;

import java.time.Clock;
public class ClockExample1 {
    public static void main(String[] args) {
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.getZone());
    }
}
