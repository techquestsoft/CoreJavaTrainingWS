package com.techquestsoft.training.Reflection;

class Test3{
    public static void main(String args[]){
        Class c = boolean.class;
        System.out.println(c.getName());

        Class c2 = Test3.class;
        System.out.println(c2.getName());
    }
}
