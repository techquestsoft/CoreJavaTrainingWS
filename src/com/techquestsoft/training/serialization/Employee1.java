package com.techquestsoft.training.serialization;
import java.io.Serializable;
class Employee1 implements Serializable{
    transient int id;
    String name;
    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
