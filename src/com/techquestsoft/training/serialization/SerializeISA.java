package com.techquestsoft.training.serialization;

import java.io.*;
class Person1 implements Serializable{
    int id;
    String name;
    Person1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
class Student1 extends Person1{
    String course;
    int fee;
    public Student1(int id, String name, String course, int fee) {
        super(id,name);
        this.course=course;
        this.fee=fee;
    }
}
public class SerializeISA
{
    public static void main(String args[])
    {
        try{
            //Creating the object
            Student1 s1 =new Student1(211,"ravi","Engineering",50000);
            //Creating stream and writing the object
            FileOutputStream fout=new FileOutputStream("f.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }catch(Exception e){System.out.println(e);}
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
            Student1 s=(Student1)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}
