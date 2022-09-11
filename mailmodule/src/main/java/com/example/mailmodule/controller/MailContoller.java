package com.example.mailmodule.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.mailmodule.entity.MailEntity;
import com.example.mailmodule.services.MailServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class MailContoller {
    @Autowired
    private MailServices mailService;
    @PostMapping(value="/mail")
    public String postMail(@RequestBody MailEntity entity) {
        String status = mailService.sendMail(entity);
        return status;
    }
    @PostMapping(value="/mailAttach")
    public String postAttachement(@RequestBody MailEntity entity) {
        String status = mailService.sendAttachment(entity);
        return status;
    }
    
}
