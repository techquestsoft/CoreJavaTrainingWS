package com.techquestsoft.training.Reflection;


class Simple {
}

public class Test {
    void printName(Object obj) {
        Class c = obj.getClass();
        System.out.println(c.getName());
    }


    public static void main(String args[]) throws Exception {
        Class c = Class.forName("com.training.Reflection.Simple");
        System.out.println(c.getName());

        Simple s = new Simple();

        Test t = new Test();
        t.printName(s);
    }
}
