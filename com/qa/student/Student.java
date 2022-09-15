package com.qa.student;

public class Student {
    private byte age;
    private String name;
    private char grade;

    public Student(byte age, String name, char grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
}
