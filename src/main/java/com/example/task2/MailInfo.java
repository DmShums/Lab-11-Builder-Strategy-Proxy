package com.example.task2;
import lombok.Getter;
import lombok.ToString;

@Getter @ToString
public class MailInfo {
    private final Client client;
    private final String mailCode;

    public MailInfo(Client client, String mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }
}
