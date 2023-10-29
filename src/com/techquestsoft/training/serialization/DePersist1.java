package com.techquestsoft.training.serialization;

import java.io.*;
class DePersist1{
    public static void main(String args[])throws Exception{
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
        Student s=(Student)in.readObject();
        System.out.println(s.id+" "+s.name+" "+s.name);
        in.close();
    }
}
