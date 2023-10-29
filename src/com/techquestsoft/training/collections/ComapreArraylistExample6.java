package com.techquestsoft.training.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ComapreArraylistExample6 {
    //defining method
    public static boolean compareList(ArrayList ls1, ArrayList ls2) {
//converts List into String and checks string are equal or not
        return ls1.toString().contentEquals(ls2.toString()) ? true : false;
    }

    public static void main(String[] args) {
        ArrayList<String> firstList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));
        ArrayList<String> secondList = new ArrayList<String>(Arrays.asList("Java", "Python", "Ruby", "Go"));
        System.out.println("When Lists are same: " + compareList(firstList, secondList));
//adding another element to the secondList
        secondList.add("C++");
//output after adding different element
        System.out.println("When Lists are not same: " + compareList(firstList, secondList));
    }
}
