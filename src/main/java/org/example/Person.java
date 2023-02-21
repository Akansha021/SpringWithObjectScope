package org.example;

import org.springframework.stereotype.Component;


public class Person {

    Person(){
        System.out.println("Constructor");
    }
    String name;
    int id;

    public String getName() {
//        System.out.println("Name");
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        System.out.println("SetName");
        this.name = name;
    }

    public int getId() {
//        System.out.println("Id");
        System.out.println(id);
        return id;
    }

    public void setId(int id) {
        System.out.println("SetId");
        this.id = id;
    }
}
