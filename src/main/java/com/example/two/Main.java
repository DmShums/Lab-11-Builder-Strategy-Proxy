package com.example.two;

public class Main {
    public static void main(String[] args) {
        Client clientOne = new Client("Victor", 19, "Male");
        Client clientTwo = new Client("Yura", 19, "Male");

        MailInfo birthdayMailInfo = new MailInfo(clientOne, "Birthday");
        MailInfo giftMailInfo = new MailInfo(clientTwo, "Gift");

        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(birthdayMailInfo);
        mailBox.addMailInfo(giftMailInfo);

        LetterStrategy birthdayLetterStrategy = new BirthdayLetterStrategy();
        LetterStrategy giftLetterStrategy = new GiftLetterStrategy();

        MailSender birthdayMailSender = new ConcreteMailSender(birthdayLetterStrategy);
        MailSender giftMailSender = new ConcreteMailSender(giftLetterStrategy);

        mailBox.sendAll(birthdayMailSender);
        mailBox.sendAll(giftMailSender);
    }
}