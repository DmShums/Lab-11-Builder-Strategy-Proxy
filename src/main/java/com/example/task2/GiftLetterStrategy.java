package com.example.task2;

public class GiftLetterStrategy implements LetterStrategy {
    @Override
    public void sendLetter(Client client) {
        System.out.println("Sending gift letter to " + client.getName());
    }
}
