package com.techquestsoft.training.collections.map;

import java.util.*;

public class HashMapExample {
    public static void main(String args[]) {
//creating object of HashMap
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
//adding key-value pair
        hm.put("John", 23);
        hm.put("Monty", 27);
        hm.put("Richard", 21);
        hm.put("Devid", 19);
        System.out.println("Before adding duplicate keys: ");
        System.out.println(hm);
//adding duplicate keys
        hm.put("Monty", 25);    //replace the Monty's previous age
        hm.put("Devid", 19);
        System.out.println("After adding duplicate keys: ");
        System.out.println(hm);
    }
}
