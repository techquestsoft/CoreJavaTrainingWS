package com.techquestsoft.training.collections.map;

import java.util.*;

class IterationExample3 {
    public static void main(String[] arg) {
        Map<String, Float> map = new HashMap<String, Float>();
        map.put("Cookies", 90.87f);
        map.put("Dry Fruits", 434.23f);
        map.put("Oats", 220.00f);
        map.put("Chocolate", 70.89f);
        for (Map.Entry<String, Float> entry : map.entrySet()) //using map.entrySet() for iteration
        {
//returns keys and values respectively
            System.out.println("Item: " + entry.getKey() + ", Price: " + entry.getValue());
        }
    }
}
