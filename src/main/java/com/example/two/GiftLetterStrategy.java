package com.example.two;

public class GiftLetterStrategy implements LetterStrategy {
    @Override
    public void sendLetter(Client client) {
        System.out.println("Sending gift letter to " + client.getName());
    }
}
