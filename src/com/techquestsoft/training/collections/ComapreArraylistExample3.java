package com.techquestsoft.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComapreArraylistExample3 {
    public static void main(String args[]) {
//first array list
        ArrayList<Integer> firstList = new ArrayList<Integer>(Arrays.asList(12, 4, 67, 90, 34));
        System.out.println("First array list: ");
        System.out.println(firstList);
//second array list
        List<Integer> secondList = new ArrayList<Integer>(Arrays.asList(12, 4, 67, 0, 34));
        System.out.println("Second array list: ");
        System.out.println(secondList);
//returns the common elements in both list
        firstList.removeAll(secondList);
        System.out.println("Un-common element of the first list: ");
        System.out.println(firstList);
    }
}