package com.xmlconfig.setterinjection;

public class Teacher {
    private String name;
    private String subject;

    public Teacher() {
        System.out.println("Teacher object created.");
    }

    public void setName(String name) { this.name = name; }
    public void setSubject(String subject) { this.subject = subject; }

    public void display() {
        System.out.println("Teacher Name: " + name);
        System.out.println("Subject: " + subject);
    }
}
