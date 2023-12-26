package com.example.task2;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;


enum Gender {
    MALE, FEMALE
}


@Data
@Builder @ToString @Getter
public class Client {
    private static int idCounter = 0;
    private final String name;
    private final int age;
    private final String sex;
}
