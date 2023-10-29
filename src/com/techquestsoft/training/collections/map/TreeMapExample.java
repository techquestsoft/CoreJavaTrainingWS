package com.techquestsoft.training.collections.map;

import java.util.Map;
import java.util.TreeMap;

class BookTreeMap {
    int id;
    String name, author, publisher;
    int quantity;

    public BookTreeMap(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class TreeMapExample {
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer, BookTreeMap> map = new TreeMap<Integer, BookTreeMap>();
        //Creating BookTreeMaps
        BookTreeMap b1 = new BookTreeMap(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        BookTreeMap b2 = new BookTreeMap(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        BookTreeMap b3 = new BookTreeMap(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to map
        map.put(2, b2);
        map.put(1, b1);
        map.put(3, b3);

        //Traversing map
        for (Map.Entry<Integer, BookTreeMap> entry : map.entrySet()) {
            int key = entry.getKey();
            BookTreeMap b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
