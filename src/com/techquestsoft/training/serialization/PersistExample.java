package com.techquestsoft.training.serialization;

import java.io.*;
class Student3 implements Serializable{
    int id;
    String name;
    transient int age;//Now it will not be serialized
    public Student3(int id, String name,int age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }
}
class PersistExample{
    public static void main(String args[])throws Exception{
        Student3 s1 =new Student3(211,"ravi",22);//creating object
        //writing object into file
        FileOutputStream f=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(f);
        out.writeObject(s1);
        out.flush();
        out.close();
        f.close();
        System.out.println("success");
    }
}
