package com.xmlconfig.constructorinjection;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
        System.out.println("Teacher object created via constructor.");
    }

    public void display() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
