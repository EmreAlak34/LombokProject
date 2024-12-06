package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.List; // Add this import
import org.example.Student;
import org.example.Teacher;
import org.example.Course;

import java.util.List;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Erstelle einen Lehrer (Teacher)
        Teacher teacher = Teacher.builder()
                .id(1)
                .name("Max Müller")
                .subject("Mathematik")
                .build();

        // Erstelle Studenten (Students)
        Student student1 = Student.builder()
                .id(1)
                .name("Anna Schmidt")
                .address("Steinstr. 3, 10115 Berlin")
                .grade(91.2)
                .build();

        Student student2 = Student.builder()
                .id(2)
                .name("Lukas Weber")
                .address("Bahnhofstr. 10, 60329 Frankfurt")
                .grade(84.5)
                .build();

        // Erstelle einen Kurs (Course) mit einem Lehrer und Studenten
        Course course = Course.builder()
                .id(101)
                .name("Fortgeschrittene Mathematik")
                .teacher(teacher)
                .students(List.of(student1, student2))
                .build();

        // Überprüfe die generierte toString()-Methode von Lombok, indem der Kurs ausgegeben wird
        System.out.println("Kurs (generiertes toString): " + course);

        // Verwende die von Lombok generierten Getter-Methoden, um auf Eigenschaften zuzugreifen
        System.out.println("Kurs ID (Getter): " + course.getId());
        System.out.println("Kurs Name (Getter): " + course.getName());
        System.out.println("Lehrer Name (Getter): " + course.getTeacher().getName());

        // Verwende die von Lombok generierte Setter-Methode, um eine Eigenschaft zu ändern (zum Testen der Setter)
        student1.setAddress("Neue Straße 15, 20253 Hamburg");
        System.out.println("Aktualisierte Adresse von Anna Schmidt (Setter): " + student1.getAddress());

        // Teste die von Lombok generierte equals()-Methode, indem zwei ähnliche Objekte verglichen werden
        Student student3 = Student.builder()
                .id(1)
                .name("Anna Schmidt")
                .address("Steinstr. 3, 10115 Berlin")
                .grade(91.2)
                .build();

        System.out.println("Sind Anna Schmidt und Student 3 gleich? " + student1.equals(student3));

        // Teste die von Lombok generierte hashCode()-Methode
        System.out.println("HashCode von Anna Schmidt: " + student1.hashCode());
        System.out.println("HashCode von Student 3: " + student3.hashCode());

        // Teste die von Lombok generierte toString()-Methode für den einzelnen Studenten
        System.out.println("Anna Schmidt (generiertes toString): " + student1);
    }
}