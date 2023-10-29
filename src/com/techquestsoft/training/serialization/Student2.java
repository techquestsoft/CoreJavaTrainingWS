package com.techquestsoft.training.serialization;

import java.io.Serializable;
public class Student2 implements Serializable{
    int id;
    String name;
    Address address;//HAS-A
    public Student2(int id, String name) {
        this.id = id;
        this.name = name;
        this.address = new Address("addr1","hyderabad","telangana");
    }

}
