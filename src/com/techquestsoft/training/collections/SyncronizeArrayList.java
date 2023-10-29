package com.techquestsoft.training.collections;

import java.util.*;

public class SyncronizeArrayList {
    public static void main(String args[]) {
        // Non Synchronized ArrayList
        List<String> fruitList = new ArrayList<String>();

        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Pineapple");

        // Synchronizing ArrayList in Java
        fruitList = Collections.synchronizedList(fruitList);

        // we must use synchronize block to avoid non-deterministic behavior
        synchronized (fruitList) {
            Iterator<String> itr = fruitList.iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }
}
