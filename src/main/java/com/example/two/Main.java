package com.example.two;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Victor", 19, "Male");
        Client client2 = new Client("Yura", 19, "Male");

        MailInfo birthdayMailInfo = new MailInfo(client1, "Birthday");
        MailInfo giftMailInfo = new MailInfo(client2, "Gift");

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