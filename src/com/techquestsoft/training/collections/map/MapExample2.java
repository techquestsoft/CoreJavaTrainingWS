package com.techquestsoft.training.collections.map;

import java.util.*;

class MapExample2 {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");
        //Elements can traverse in any order
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
