package org.example;

import java.util.List;

public class BonusMain {
    public static void main(String[] args) {
        // 1. Erstelle den Lehrer für den Kurs
        Teacher teacher = Teacher.builder()
                .id(1)
                .name("Max Müller")
                .subject("Mathematik")
                .build();

        // 2. Erstelle die Studenten
        Student student1 = Student.builder()
                .id(1)
                .name("Anna Schmidt")
                .address("Steinstr. 3, 10115 Berlin")
                .grade(1.5)
                .build();

        Student student2 = Student.builder()
                .id(2)
                .name("Lukas Weber")
                .address("Bahnhofstr. 10, 60329 Frankfurt")
                .grade(2.5)
                .build();

        // 3. Erstelle den Kurs
        Course course1 = Course.builder()
                .id(101)
                .name("Mathematik 101")
                .teacher(teacher)
                .students(List.of(student1, student2))
                .build();

        // 4. Erstelle die Universität
        University university = new University(1, "Universität Berlin", List.of(course1));

        // 5. Erstelle den UniversityService
        UniversityService universityService = new UniversityService();

        // 6. Berechne und gib die durchschnittliche Note des Kurses aus
        double courseAverage = universityService.calculateAverageGrade(course1);
        System.out.println("Durchschnittsnote des Kurses: " + courseAverage);

        // 7. Berechne und gib die durchschnittliche Note der gesamten Universität aus
        double universityAverage = universityService.calculateUniversityAverageGrade(university);
        System.out.println("Durchschnittsnote der Universität: " + universityAverage);

        // 8. Gib alle Studenten zurück, die mindestens die Note 2 (Gut) haben
        List<Student> goodStudents = universityService.getStudentsWithMinimumGrade(university, 2.0);
        System.out.println("Studenten mit einer Mindestnote von 2: " + goodStudents);
    }
}
