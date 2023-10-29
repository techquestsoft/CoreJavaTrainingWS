package com.techquestsoft.training.collections;

import java.io.FileWriter;
import java.util.Properties;

public class CreateProperties {
    public static void main(String[] args) throws Exception {

        Properties p = new Properties();
        p.setProperty("name", "Sonoo Jaiswal");
        p.setProperty("email", "sonoojaiswal@javatpoint.com");

        p.store(new FileWriter("info.properties"), "Javatpoint Properties Example");

    }
}
