package org.example;

import lombok.Data;
import lombok.Builder;
import lombok.With;

@Data
@Builder
@With
public class Student {
    private int id;
    private String name;
    private String address;
    private double grade;
}
