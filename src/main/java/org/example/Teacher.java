package org.example;

import lombok.Data;
import lombok.Builder;
import lombok.With;

@Data
@Builder
@With
public class Teacher {
    private int id;
    private String name;
    private String subject;
}
