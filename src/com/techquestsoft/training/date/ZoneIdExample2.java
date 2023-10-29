package com.techquestsoft.training.date;

import java.time.ZoneId;
public class ZoneIdExample2 {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
    }
}
