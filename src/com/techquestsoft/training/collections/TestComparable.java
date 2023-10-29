package com.techquestsoft.training.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {
    public static void main(String args[]) {
        ArrayList<StudentComparable> al = new ArrayList<StudentComparable>();
        al.add(new StudentComparable(101, "Vijay", 23));
        al.add(new StudentComparable(106, "Ajay", 27));
        al.add(new StudentComparable(105, "Jai", 21));

        Collections.sort(al);
        for (StudentComparable st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}
