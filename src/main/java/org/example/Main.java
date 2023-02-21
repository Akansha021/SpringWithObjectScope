package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Person person1= (Person) context.getBean("person");

        person1.getName();
        person1.getId();

        System.out.println(person1.hashCode());


//        Person person2= (Person) context.getBean("person1");
//
//        person2.getName();
//        person2.getId();

        Person person3= (Person) context.getBean("person");
        person3.setId(4);
        person3.getId();
        person1.getId();
        System.out.println(person3.hashCode());


    }
}