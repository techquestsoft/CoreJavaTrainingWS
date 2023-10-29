package com.techquestsoft.training.collections;

import java.util.Comparator;

public class AgeComparatorGeneric implements Comparator<StudentComparator> {
    public int compare(StudentComparator s1, StudentComparator s2) {
        if (s1.age == s2.age)
            return 0;
        else if (s1.age > s2.age)
            return 1;
        else
            return -1;
    }
}