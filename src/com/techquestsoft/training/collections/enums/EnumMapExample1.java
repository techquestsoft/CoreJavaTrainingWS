package com.techquestsoft.training.collections.enums;

import java.util.EnumMap;
import java.util.Map;

class BookEnumMap {
    int id;
    String name, author, publisher;
    int quantity;

    public BookEnumMap(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class EnumMapExample1 {
    // Creating enum
    public enum Key {
        One, Two, Three
    }

    ;

    public static void main(String[] args) {
        EnumMap<Key, BookEnumMap> map = new EnumMap<Key, BookEnumMap>(Key.class);
        // Creating Books
        BookEnumMap b1 = new BookEnumMap(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        BookEnumMap b2 = new BookEnumMap(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        BookEnumMap b3 = new BookEnumMap(103, "Operating System", "Galvin", "Wiley", 6);
        // Adding Books to Map
        map.put(Key.One, b1);
        map.put(Key.Two, b2);
        map.put(Key.Three, b3);
        // Traversing EnumMap
        for (Map.Entry<Key, BookEnumMap> entry : map.entrySet()) {
            BookEnumMap b = entry.getValue();
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
