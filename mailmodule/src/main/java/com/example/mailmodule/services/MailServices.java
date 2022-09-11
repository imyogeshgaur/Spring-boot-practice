package com.example.mailmodule.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.mailmodule.entity.MailEntity;
import com.example.mailmodule.module.MailModule;

@Service
public class MailServices implements MailModule{

    @Autowired
    private JavaMailSender mailSender;

    @Value("${spring.mail.username}") private String sender;
    @Override
    public String sendMail(MailEntity mail) {
        try {
            SimpleMailMessage mailObj = new SimpleMailMessage();
            mailObj.setFrom(sender);
            mailObj.setTo(mail.getReciver());
            mailObj.setSubject(mail.getSubjectOfBody());
            mailObj.setText(mail.getMessageBody());

            mailSender.send(mailObj);
            return "Email Send Sucessfully !!!";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Internal Server Error !!!";
        }
        
    }
}
