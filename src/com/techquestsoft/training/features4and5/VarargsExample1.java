package com.techquestsoft.training.features4and5;

class VarargsExample1 {

    static void display(String... values) {
        System.out.println("display method invoked ");
    }

    public static void main(String args[]) {

        display();//zero argument
        display("my", "name", "is", "varargs");//four arguments
    }
}