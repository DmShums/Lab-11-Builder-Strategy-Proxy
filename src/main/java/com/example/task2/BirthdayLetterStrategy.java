package com.example.task2;

public class BirthdayLetterStrategy implements LetterStrategy {
    @Override
    public void sendLetter(Client client) {
        System.out.println("Sending birthday letter to " + client.getName());
    }
}

