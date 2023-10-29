package com.techquestsoft.training.collections;

import java.util.*;

public class LengthVsSize {
    public static void main(String[] args) {
        //creating array of 10 elements
        int arr[] = new int[10];
        //storing 2 elements
        arr[0] = 10;
        arr[1] = 12;
        //printing length of array
        System.out.println(arr.length);//10

        //Creating ArrayList
        ArrayList<String> list = new ArrayList<String>();
        //storing 2 elements
        list.add("ankit");
        list.add("nippun");
        //printing size of ArrayList
        System.out.println(list.size());//2
    }
}
