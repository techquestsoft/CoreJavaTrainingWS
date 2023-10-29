package com.techquestsoft.training.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class TestJavaCollection2 {
    public static void main(String args[]) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
