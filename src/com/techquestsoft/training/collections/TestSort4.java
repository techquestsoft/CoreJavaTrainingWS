package com.techquestsoft.training.collections;

import java.util.ArrayList;
import java.util.Collections;

class StudentSort implements Comparable<StudentSort> {
    public String name;

    public StudentSort(String name) {
        this.name = name;
    }

    public int compareTo(StudentSort person) {
        return name.compareTo(person.name);

    }
}

public class TestSort4 {
    public static void main(String[] args) {
        ArrayList<StudentSort> al = new ArrayList<StudentSort>();
        al.add(new StudentSort("Viru"));
        al.add(new StudentSort("Saurav"));
        al.add(new StudentSort("Mukesh"));
        al.add(new StudentSort("Tahir"));

        Collections.sort(al);
        for (StudentSort s : al) {
            System.out.println(s.name);
        }
    }
}
