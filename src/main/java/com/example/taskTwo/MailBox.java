package com.example.taskTwo;
import java.util.ArrayList;
import java.util.List;


public class MailBox {
    private final List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo info) {
        infos.add(info);
    }

    public void sendAll(MailSender mailSender) {
        for (MailInfo info : infos) {
            mailSender.sendMail(info);
        }
    }
}
