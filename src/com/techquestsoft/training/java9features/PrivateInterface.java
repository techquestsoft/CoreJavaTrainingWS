package com.techquestsoft.training.java9features;

interface Sayable {
    default void say() {
        saySomething();
    }

    // Private method inside interface
    private void saySomething() {
        System.out.println("Hello... I'm private method");
    }
}

public class PrivateInterface implements Sayable {
    public static void main(String[] args) {
        Sayable s = new PrivateInterface();
        s.say();
    }
}