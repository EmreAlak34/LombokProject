package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class UniversityService {

    // Berechnet die durchschnittliche Note eines Kurses
    public double calculateAverageGrade(Course course) {
        double sum = 0;
        for (Student student : course.getStudents()) {
            sum += student.getGrade();
        }
        return sum / course.getStudents().size();
    }

    // Berechnet die durchschnittliche Note der gesamten Universität
    public double calculateUniversityAverageGrade(University university) {
        double sum = 0;
        int count = 0;

        // Gehe durch alle Kurse der Universität
        for (Course course : university.courses()) {
            sum += calculateAverageGrade(course) * course.getStudents().size();
            count += course.getStudents().size();
        }

        return sum / count;
    }

    // Gibt alle Studenten zurück, die mindestens die Note 2 (Gut) haben
    public List<Student> getStudentsWithMinimumGrade(University university, double minGrade) {
        return university.courses().stream()
                .flatMap(course -> course.getStudents().stream())
                .filter(student -> student.getGrade() >= minGrade)
                .collect(Collectors.toList());
    }
}
