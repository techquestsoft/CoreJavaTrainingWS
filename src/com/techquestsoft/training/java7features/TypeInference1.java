package com.techquestsoft.training.java7features;

class GenericClass<X> {
    <T> GenericClass(T t) {
        System.out.println(t);
    }
}

public class TypeInference1 {
    public static void main(String[] args) {
        GenericClass<String> gc2 = new GenericClass<>("Hello");
    }
}
