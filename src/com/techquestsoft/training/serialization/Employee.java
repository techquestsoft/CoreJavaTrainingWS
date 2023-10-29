package com.techquestsoft.training.serialization;
import java.io.Serializable;
class Employee implements Serializable{
    int id;
    String name;
    static String company="SSS IT Pvt Ltd";//it won't be serialized
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
