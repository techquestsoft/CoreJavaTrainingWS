package com.techquestsoft.training.collections.map;

import java.util.*;

class IterationExample2 {
    public static void main(String[] arg) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Gujarat", "Gandhi Nagar");
        map.put("Uttar Pradesh", "Lucknow");
        map.put("Sikkim", "Ganagtok");
        for (String State : map.keySet())   //using keyset() method for iteration over keySet
            System.out.println("State: " + State);
        for (String Capital : map.values())         //using values() for iteration over keys
            System.out.println("Capiatl: " + Capital);
    }
}
