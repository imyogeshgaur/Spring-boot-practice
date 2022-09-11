package com.example.mailmodule.services;

import java.io.File;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
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
    @Override
    public String sendAttachment(MailEntity mail) {
        MimeMessage mimemessage = mailSender.createMimeMessage();
        MimeMessageHelper helper;
        try {
            helper = new MimeMessageHelper(mimemessage,true,"UTF-8");
            helper.setFrom(sender);
            helper.setTo(mail.getReciver());
            helper.setSubject(mail.getSubjectOfBody());
            helper.setText(mail.getMessageBody());
            FileSystemResource file = new FileSystemResource(new File(mail.getAttachmentOfMail()));

            helper.addAttachment(file.getFilename(),file);

            mailSender.send(mimemessage);
            return "Attachement Send Sucessfully !!!";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Internal Server Error !!!";
        }
    }
}
