package com.example.demo.messages.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "message")
public class Message {

    private int messageId;
    private String text;
    private int emisorId;
    private int receptorId;


    public Message(){}


    @Id
    @GeneratedValue
    @Column(name = "message_id")
    public int getMessageId(){return this.messageId;}

    public void setMessageId(int messageId){
        this.messageId = messageId;
    }

    @Column(name = "text")
    public String getText(){
        return this.text;
    }

    public void setText(String text){
        this.text = text;
    }

    @Column(name = "emisor_id")
    public int getEmisorId(){
        return this.emisorId;
    }

    public void setEmisorId(int emisorId){
        this.emisorId = emisorId;
    }

    @Column(name = "receptor_id")
    public int getReceptorId(){return this.receptorId;}

    public void setReceptorId(int receptorId){
        this.receptorId = receptorId;
    }

}
