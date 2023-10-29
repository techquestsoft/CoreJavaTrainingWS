package com.techquestsoft.training.java9features;

import java.util.Map;

public class FactoryMethodsExample2 {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(101, "JavaFX", 102, "Hibernate", 103, "Spring MVC");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
