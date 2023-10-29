package com.techquestsoft.training.collections.map;

import java.util.Hashtable;
import java.util.Map;

class BookHashtable {
    int id;
    String name, author, publisher;
    int quantity;

    public BookHashtable(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}

public class HashtableExample {
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer, BookHashtable> map = new Hashtable<Integer, BookHashtable>();
        //Creating BookHashtables
        BookHashtable b1 = new BookHashtable(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        BookHashtable b2 = new BookHashtable(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        BookHashtable b3 = new BookHashtable(103, "Operating System", "Galvin", "Wiley", 6);
        //Adding Books to map
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);
        //Traversing map
        for (Map.Entry<Integer, BookHashtable> entry : map.entrySet()) {
            int key = entry.getKey();
            BookHashtable b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
        }
    }
}
