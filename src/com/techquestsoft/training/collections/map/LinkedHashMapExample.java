package com.techquestsoft.training.collections.map;

import java.util.*;

class BookLinled {
    int id;
    String name, author, publisher;
    int quantity;

    public BookLinled(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class LinkedHashMapExample {
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer, BookLinled> map = new LinkedHashMap<Integer, BookLinled>();
        //Creating BookLinleds
        BookLinled b1 = new BookLinled(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        BookLinled b2 = new BookLinled(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        BookLinled b3 = new BookLinled(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to map
        map.put(2, b2);
        map.put(1, b1);
        map.put(3, b3);

        //Traversing map
        for (Map.Entry<Integer, BookLinled> entry : map.entrySet()) {
            int key = entry.getKey();
            BookLinled b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
