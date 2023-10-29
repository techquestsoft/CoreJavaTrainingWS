package com.techquestsoft.training.java8newfeatures.java8stream;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Student {
    String sname;
    int sid;
    char grade;

    public Student(String sname, int sid, char grade) {
        this.sname = sname;
        this.sid = sid;
        this.grade = grade;
    }
}

public class FlatMapDemo3 {


    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<Student>();

        list1.add(new Student("Scot", 1, 'C'));
        list1.add(new Student("John", 2, 'B'));
        list1.add(new Student("Kennedy", 3, 'A'));

        List<Student> list2 = new ArrayList<Student>();

        list2.add(new Student("Scot1", 11, 'D'));
        list2.add(new Student("John1", 21, 'E'));
        list2.add(new Student("Kennedy1", 31, 'F'));

        List<Student> list3 = new ArrayList<Student>();

        list3.add(new Student("Scot2", 12, 'G'));
        list3.add(new Student("John2", 22, 'H'));
        list3.add(new Student("Kennedy2", 32, 'I'));

        List<List<Student>> totalStudents = Arrays.asList(list1, list2, list3);

        // before JAVA 8
        for (java.util.List<Student> team : totalStudents) {
            for (Student student : team) {
                System.out.println(student.sname);
            }
        }

        List<Student> finalResults =
                totalStudents.stream().flatMap(n -> n.stream().map(n1 -> n1)).collect(Collectors.toList());
        finalResults.stream().map(n -> n.sname).forEach(n -> System.out.println(n));
        // System.out.println(finalResults);

        List<String> finalResults1 =
                totalStudents.stream().flatMap(n -> n.stream().map(student -> student.sname)).collect(Collectors.toList());

        System.out.println(finalResults1);
    }
}
