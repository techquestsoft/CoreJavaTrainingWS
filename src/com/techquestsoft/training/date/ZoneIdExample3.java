package com.techquestsoft.training.date;

import java.time.ZoneId;
public class ZoneIdExample3 {
    public static void main(String[] args) {
        ZoneId z = ZoneId.systemDefault();
        String s = z.getId();
        System.out.println(s);
    }
}
