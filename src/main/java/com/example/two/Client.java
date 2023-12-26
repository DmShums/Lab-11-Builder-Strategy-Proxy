package com.example.two;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
@Builder @ToString @Getter
public class Client {
    private static int idCounter = 0;
    private final String name;
    private final int age;
    private final String sex;
}
