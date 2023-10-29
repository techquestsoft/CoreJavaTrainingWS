package com.techquestsoft.training.java8newfeatures.methodreference;

interface Sayable3 {
    void say();
}

public class InstanceMethodReference1 {
    public void saySomething() {
        System.out.println("Hello, this is non-static method.");
    }

    public static void main(String[] args) {
        InstanceMethodReference1 methodReference = new InstanceMethodReference1(); // Creating object
        // Referring non-static method using reference
        Sayable3 sayable = methodReference::saySomething;
        // Calling interface method
        sayable.say();
        // Referring non-static method using anonymous object
        Sayable3 sayable2 = new InstanceMethodReference1()::saySomething; // You can use anonymous object also
        // Calling interface method
        sayable2.say();
    }
}
