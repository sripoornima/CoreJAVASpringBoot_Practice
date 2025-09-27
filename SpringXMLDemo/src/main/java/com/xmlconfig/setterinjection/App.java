package com.xmlconfig.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("studentBean");
        student.display();

        Teacher teacher = (Teacher) context.getBean("teacherBean");
        teacher.display();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
