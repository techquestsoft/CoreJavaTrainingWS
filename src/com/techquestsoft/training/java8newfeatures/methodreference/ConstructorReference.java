package com.techquestsoft.training.java8newfeatures.methodreference;

interface Messageable {
    Message getMessage(String msg, int count);
}

class Message {
    Message(String msg) {
        System.out.print(msg);
    }
    Message(String msg, int count) {
        System.out.print(msg + count);
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello", 10);
    }
}
