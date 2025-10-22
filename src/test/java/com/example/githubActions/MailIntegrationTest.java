package com.example.githubActions;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest
class MailIntegrationTest {

    @Autowired
    private JavaMailSender mailSender;

    @Test
    void testMailSend() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("test@example.com");
        message.setTo("recipient@example.com");
        message.setSubject("CI Test");
        message.setText("Hello from GitHub Actions!");
        mailSender.send(message);
    }
}
