package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List; // Add this import
import org.example.Student;
import org.example.Teacher;
import org.example.Course;

public class Main {
    public static void main(String[] args) {
        // Create a Teacher
        Teacher teacher = Teacher.builder()
                .id(1)
                .name("John Doe")
                .subject("Mathematics")
                .build();

        // Create Students
        Student student1 = Student.builder()
                .id(1)
                .name("Alice")
                .address("123 Main St")
                .grade(95.5)
                .build();

        Student student2 = Student.builder()
                .id(2)
                .name("Bob")
                .address("456 Oak St")
                .grade(88.0)
                .build();

        // Create a Course with a teacher and students
        Course course = Course.builder()
                .id(101)
                .name("Advanced Math")
                .teacher(teacher)
                .students(List.of(student1, student2))
                .build();

        // Print the original course details
        System.out.println("Original Course: " + course);

        // Modify a student's address using @With
        Student updatedStudent1 = student1.withAddress("789 New Address St");

        // Print the updated student details
        System.out.println("Updated Student 1: " + updatedStudent1);

        // Create a new Course with the updated student (student1's address changed)
        Course updatedCourse = course.withStudents(List.of(updatedStudent1, student2));

        // Print the updated course details
        System.out.println("Updated Course: " + updatedCourse);
    }
}