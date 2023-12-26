package com.example.task1;

public class Main {
    public static void main(String[] args) {
        User usr = User.builder().name("Dmytro").age(19).build();

        System.out.println(usr);
    }
}
