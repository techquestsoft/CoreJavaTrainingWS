package com.techquestsoft.training.collections;

import java.util.Comparator;

public class NameComparatorGeneric implements Comparator<StudentComparator> {
    public int compare(StudentComparator s1, StudentComparator s2) {
        return s1.name.compareTo(s2.name);
    }
}