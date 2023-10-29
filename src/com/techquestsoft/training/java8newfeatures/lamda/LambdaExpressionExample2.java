package com.techquestsoft.training.java8newfeatures.lamda;

@FunctionalInterface  //It is optional
interface Drawable1 {
    public void draw();
}

public class LambdaExpressionExample2 {
    public static void main(String[] args) {
        int width = 10;

        //without lambda, Drawable implementation using anonymous class
        /*Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();*/

        //with lambda
        Drawable1 d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
