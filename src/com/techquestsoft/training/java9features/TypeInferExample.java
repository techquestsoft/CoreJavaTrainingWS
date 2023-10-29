package com.techquestsoft.training.java9features;

abstract class ABCD<T> {
    abstract T show(T a, T b);
}

public class TypeInferExample {
    public static void main(String[] args) {
        ABCD<String> a = new ABCD<>() { // diamond operator is empty, compiler infer type
            String show(String a, String b) {
                return a + b;
            }
        };
        String result = a.show("Java", "9");
        System.out.println(result);
    }
}
