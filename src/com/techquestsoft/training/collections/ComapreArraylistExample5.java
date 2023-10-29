package com.techquestsoft.training.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ComapreArraylistExample5 {
    public static void main(String[] args) {
//first arraylist
        ArrayList<String> firstList = new ArrayList<String>(Arrays.asList("Good", "Morning", "Students"));
//second arraylist
        ArrayList<String> secondList = new ArrayList<String>(Arrays.asList("Good", "Night", "frineds"));
//storing the comparison output in thirdList
        ArrayList<String> thirdList = new ArrayList<String>();
//iterator using for-each loop
        for (String tempList : firstList)    //tempList is  a variable
            thirdList.add(secondList.contains(tempList) ? "Yes" : "No");
        System.out.println(thirdList);
    }
}
