package com.techquestsoft.training.serialization;

import java.io.Serializable;
class Employee2 implements Serializable{
    private static final long serialVersionUID=1L;
    int id;
    String name;
    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
