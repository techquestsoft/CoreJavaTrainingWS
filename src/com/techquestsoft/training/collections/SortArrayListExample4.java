package com.techquestsoft.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListExample4 {
    public static void main(String args[]) {
//creating an object of ArrayList class
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(566);
        list.add(230);
        list.add(123);
        list.add(110);
        list.add(689);
        list.add(12);
        list.add(95);
//printing ArrayList before sorting
        System.out.println("ArrayList Before Sorting:");
        for (int marks : list) {
            System.out.println(marks);
        }
//sorting ArrayList in descending order
        Collections.sort(list, Collections.reverseOrder());
//printing ArrayList after sorting
        System.out.println("ArrayList After Sorting:");
        for (int marks : list) {
            System.out.println(marks);
        }
    }
}
