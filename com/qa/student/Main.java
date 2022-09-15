package com.qa.student;

public class Main {
    public static void main(String[] args) {
        byte age = 31;
        String name = "Sam";
        char grade = 'A';
        Student aStudent = new Student(age, name, grade);
        System.out.println(aStudent.getName() + " is " + aStudent.getAge() + " years old and got a grade of "
                + aStudent.getGrade());

        String newName = "Harry";
        byte newAge = 25;
        char newGrade = 'C';
        aStudent.setName(newName);
        aStudent.setAge(newAge);
        aStudent.setGrade(newGrade);
        System.out.println(aStudent.getName() + " is " + aStudent.getAge() + " years old and got a grade of "
                + aStudent.getGrade());
    }
}
