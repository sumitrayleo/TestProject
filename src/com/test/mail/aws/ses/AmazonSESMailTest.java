package com.test.mail.aws.ses;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class AmazonSESMailTest {

    static final String FROM = ""; // Replace with your "From" address. This address must be verified.
    static final String TO = ""; // Replace with a "To" address. If your account is still in the
                                                      // sandbox, this address must be verified.

    static final String BODY = "This email was sent through the Amazon SES SMTP interface by using Java.";
    static final String SUBJECT = "Amazon SES test";

    static final String SMTP_USERNAME = ""; // Replace with your SMTP username.
    static final String SMTP_PASSWORD = ""; // Replace with your SMTP password.

    // Amazon SES SMTP host name. 
    static final String HOST = "email-smtp.us-east-1.amazonaws.com";
    static final int PORT = 25;

    public static void main(String[] args) throws Exception {

        Properties props = System.getProperties();
        props.put("mail.transport.protocol", "smtps");
        props.put("mail.smtp.port", PORT);

        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.starttls.required", "true");

        Session session = Session.getDefaultInstance(props);
        session.setDebug(true);
        
        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(FROM));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO));
        msg.reply(true);
        msg.setReplyTo(new javax.mail.Address[] { new javax.mail.internet.InternetAddress(""),  new InternetAddress(FROM)});
        msg.setSubject(SUBJECT);
        msg.setContent(BODY, "text/plain");

        Transport transport = session.getTransport();
        try {
            System.out.println("Attempting to send an email through the Amazon SES SMTP interface...");

            transport.connect(HOST, SMTP_USERNAME, SMTP_PASSWORD);
            transport.sendMessage(msg, msg.getAllRecipients());
            System.out.println("Email sent!");
        } catch (Exception ex) {
            System.out.println("The email was not sent.");
            System.out.println("Error message: " + ex.getMessage());
        } finally {
            transport.close();
        }
    }
}