package com.techquestsoft.training.collections;

public class StudentReverse implements Comparable<StudentReverse> {
    int rollno;
    String name;
    int age;

    StudentReverse(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public int compareTo(StudentReverse st) {
        if (age == st.age)
            return 0;
        else if (age < st.age)
            return 1;
        else
            return -1;
    }
}