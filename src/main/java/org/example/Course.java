package org.example;

import lombok.*;

import java.util.List;

@Value
@Builder
@With
public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}
