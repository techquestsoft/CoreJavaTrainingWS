package com.techquestsoft.training.collections.map;

import java.util.*;

class MapExample3 {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }
}
