package com.example.mailmodule.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class MailEntity{
    private String reciver;
    private String messageBody;
    private String subjectOfMail;
    

    public void setReciver(String reciever){
         this.reciver = reciever;
    }
    public void setMessageBody(String messageBody){
         this.messageBody = messageBody;
    }
    public void setSubjectOfBody(String subjectOfMail){
         this.subjectOfMail= subjectOfMail;
    }
    public String getReciver(){
        return reciver;
    }
    public String getMessageBody(){
        return messageBody;
    }
    public String getSubjectOfBody(){
        return subjectOfMail;
    }
}
