package com.xmlconfig.constructorinjection;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext constructor.xml");

        Student ztudent = (Student) context.getBean("studentBean");
        ztudent.display();

        Teacher deacher = (Teacher) context.getBean("teacherBean");
        deacher.display();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
