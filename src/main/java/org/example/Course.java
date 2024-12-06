package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.With;

import java.util.List;

@Data
@Builder
@With
public class Course {
    private int id;
    private String name;
    private Teacher teacher;
    private List<Student> students;
}
