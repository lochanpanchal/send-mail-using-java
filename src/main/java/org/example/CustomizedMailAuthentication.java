package org.example;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class CustomizedMailAuthentication extends Authenticator {
    @Override
    protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(MailMetaData.myUserMail,MailMetaData.password);
    }
}
