package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List; // Add this import
import org.example.Student;
import org.example.Teacher;
import org.example.Course;

public class Main {
    public static void main(String[] args) {

        Teacher teacher = Teacher.builder()
                .id(1)
                .name("Peter Lustig")
                .subject("Musik")
                .build();


        Student student1 = Student.builder()
                .id(1)
                .name("Petra")
                .address("Im Winkel 9")
                .grade(80)
                .build();

        Student student2 = Student.builder()
                .id(2)
                .name("Bob")
                .address("Ottostr. 8")
                .grade(88)
                .build();


        Course course = Course.builder()
                .id(101)
                .name("Geometrie")
                .teacher(teacher)
                .students(List.of(student1, student2))
                .build();


        System.out.println("Original Course: " + course);


        Student updatedStudent1 = student1.withAddress("Neue Straße 00");


        System.out.println("Updated Student 1: " + updatedStudent1);


        Course updatedCourse = course.withStudents(List.of(updatedStudent1, student2));


        System.out.println("Updated Course: " + updatedCourse);
    }
}