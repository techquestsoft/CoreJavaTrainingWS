package com.techquestsoft.training.java8newfeatures.defaultmethods;

interface Sayable1 {
    // default method
    default void say() {
        System.out.println("Hello, this is default method");
    }

    // Abstract method
    void sayMore(String msg);

    // static method
    static void sayLouder(String msg) {
        System.out.println(msg);
    }
}

public class DefaultMethods1 implements Sayable1 {
    public void sayMore(String msg) {     // implementing abstract method
        System.out.println(msg);
    }

    public static void main(String[] args) {
        DefaultMethods dm = new DefaultMethods();
        dm.say();                       // calling default method
        dm.sayMore("Work is worship");      // calling abstract method
        Sayable1.sayLouder("Helloooo...");   // calling static method
    }
}
