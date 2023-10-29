package com.techquestsoft.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable1 {
    public static void main(String args[]) {
        ArrayList<StudentReverse> al = new ArrayList<StudentReverse>();
        al.add(new StudentReverse(101, "Vijay", 23));
        al.add(new StudentReverse(106, "Ajay", 27));
        al.add(new StudentReverse(105, "Jai", 21));

        Collections.sort(al);
        for (StudentReverse st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}