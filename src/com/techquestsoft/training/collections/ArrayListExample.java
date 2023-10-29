package com.techquestsoft.training.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String args[]) {
//creating an instance of ArrayList
        List<Float> list = new ArrayList<Float>();
//adding element to arraylist
        list.add(12.4f);
        list.add(34.6f);
        list.add(56.8f);
        list.add(78.9f);
//iteration over ArrayList using for-each loop
        for (Float f : list) {
            System.out.println(f);
        }
    }
}
