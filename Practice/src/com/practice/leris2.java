package com.practice;

//now my requirement is to assign each unique roll number
//to 100 different student which should be unique and can't 
//be changes and also repeat the same for all four class 
//rooms s1, s2, s3 and s4..


import java.util.ArrayList;
import java.util.List;

class Student {
    final int roll; // Unique, immutable roll number

    public Student(int roll) {
        this.roll = roll;
    }
}

class Classroom {
    List<Student> students = new ArrayList<>(); // List to store 100 unique students

    public Classroom(int startRoll) {
        for (int i = 0; i < 100; i++) {
            students.add(new Student(startRoll + i)); // Assign unique roll numbers starting from startRoll
        }
    }

    public void displayRollNumbers() {
        for (Student student : students) {
            System.out.println("Roll number: " + student.roll);
        }
    }
}

public class leris2 {
    public static void main(String[] args) {
        // Four classrooms with unique roll numbers for each student
        Classroom s1 = new Classroom(1);    // Roll numbers 1 to 100
        Classroom s2 = new Classroom(101);  // Roll numbers 101 to 200
        Classroom s3 = new Classroom(201);  // Roll numbers 201 to 300
        Classroom s4 = new Classroom(301);  // Roll numbers 301 to 400

        System.out.println("Classroom s1:");
        s1.displayRollNumbers();

        System.out.println("\nClassroom s2:");
        s2.displayRollNumbers();

        System.out.println("\nClassroom s3:");
        s3.displayRollNumbers();

        System.out.println("\nClassroom s4:");
        s4.displayRollNumbers();
    }
}
