package com.example.mailmodule.module;

import com.example.mailmodule.entity.MailEntity;

public interface MailModule {
    String sendMail(MailEntity mail);

    String sendAttachment(MailEntity mail);
}
