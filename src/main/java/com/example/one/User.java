package com.example.one;
import lombok.Builder;
import lombok.Data;


enum Gender {
    MALE, FEMALE
}

@Data
@Builder
public class User {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
}