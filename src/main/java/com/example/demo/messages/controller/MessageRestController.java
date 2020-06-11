package com.example.demo.messages.controller;

import com.example.demo.controllers.security.LoginRestController;
import com.example.demo.domain.usuaris.Usuari;
import com.example.demo.messages.domain.Message;
import com.example.demo.messages.repositories.MessageRepositori;
import com.example.demo.repositories.usuaris.UsuariRepositori;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/message")
public class MessageRestController {

    private MessageRepositori messageRepositori;

    public MessageRestController(MessageRepositori messageRepositori){
        this.messageRepositori = messageRepositori;
    }


    @GetMapping("/{codiConversa}")
    public List<Message> getMessagesByReceptorIdAndEmisorId(@PathVariable String codiConversa){
        return this.messageRepositori.findAllByCodiConversaOrderByMessageIdAsc(codiConversa);
    }

    @PostMapping("")
    public Message postMessage(@RequestBody Message message){
        return messageRepositori.save(message);
    }

}
