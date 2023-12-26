package com.example.two;

public class ConcreteMailSender implements MailSender {
    private final LetterStrategy letterStrategy;

    public ConcreteMailSender(LetterStrategy letterStrategy) {
        this.letterStrategy = letterStrategy;
    }

    @Override
    public void sendMail(MailInfo mailInfo) {
        letterStrategy.sendLetter(mailInfo.getClient());
    }
}