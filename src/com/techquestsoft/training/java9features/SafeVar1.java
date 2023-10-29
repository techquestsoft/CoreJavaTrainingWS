package com.techquestsoft.training.java9features;

import java.util.ArrayList;
import java.util.List;

public class SafeVar1 {
    // Applying @SaveVarargs annotation
    @SafeVarargs
    private void display(List<String>... products) { // Not using @SaveVarargs
        for (List<String> product : products) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        SafeVar1 p = new SafeVar1();
        List<String> list = new ArrayList<String>();
        list.add("Laptop");
        list.add("Tablet");
        p.display(list);
    }
}
