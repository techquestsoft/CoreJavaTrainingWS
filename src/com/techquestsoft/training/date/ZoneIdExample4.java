package com.techquestsoft.training.date;

import java.util.Locale;
import java.time.ZoneId;
import java.time.format.TextStyle;
public class ZoneIdExample4 {
    public static void main(String[] args) {
        ZoneId z = ZoneId.systemDefault();
        System.out.println(z.getDisplayName(TextStyle.FULL, Locale.ROOT));
    }
}
