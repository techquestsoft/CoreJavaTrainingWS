package com.techquestsoft.training.java9features;

import java.util.Set;
public class FactoryMethodsExample1 {
    public static void main(String[] args) {
        Set<String> set = Set.of("Java","JavaFX","Spring","Hibernate","JSP");
        for(String l:set) {
            System.out.println(l);
        }
    }
}