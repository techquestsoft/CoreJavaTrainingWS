package com.techquestsoft.training.java9features;


public class TypeInferExample1 {
    public static void main(String[] args) {
        ABCD<String> a = new ABCD<String>() { // diamond operator is not empty
            String show(String a, String b) {
                return a + b;
            }
        };
        String result = a.show("Java", "9");
        System.out.println(result);
    }
}
