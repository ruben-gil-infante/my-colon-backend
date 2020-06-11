package com.example.demo.messages.controller;

import com.example.demo.messages.domain.Message;
import com.example.demo.messages.repositories.MessageRepositori;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/message")
public class MessageRestController {

    private MessageRepositori messageRepositori;

    public MessageRestController(MessageRepositori messageRepositori){
        this.messageRepositori = messageRepositori;
    }


    @GetMapping("/{emisorId}/{receptorId}")
    public List<Message> getMessagesByReceptorIdAndEmisorId(@PathVariable Integer emisorId, @PathVariable Integer receptorId){
        return messageRepositori.findAllByEmisorIdAndReceptorIdOrderByMessageIdDesc(emisorId, receptorId);
    }


    @PostMapping("")
    public Message postMessage(@RequestBody Message message){
        return messageRepositori.save(message);
    }

}
