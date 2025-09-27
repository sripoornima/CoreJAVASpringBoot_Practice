package com.xmlconfig.setterinjection;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("Student object created.");
    }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
