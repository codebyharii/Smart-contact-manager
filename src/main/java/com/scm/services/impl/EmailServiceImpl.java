package com.scm.services.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.scm.services.EmailService;

@Service
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender mailSender;

    @Value("${app.domain-name}")
    private String domainName;

    public EmailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void sendEmail(String to, String subject, String body) {

        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);

        // Set from email properly (not domain URL)
        message.setFrom("no-reply@" + domainName.replace("http://", "").replace("https://", ""));

        mailSender.send(message);
    }

    @Override
    public void sendEmailWithHtml() {
        throw new UnsupportedOperationException("Unimplemented method");
    }

    @Override
    public void sendEmailWithAttachment() {
        throw new UnsupportedOperationException("Unimplemented method");
    }
}