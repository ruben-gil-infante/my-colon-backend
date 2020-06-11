package com.example.demo.messages.controller;

import com.example.demo.controllers.security.LoginRestController;
import com.example.demo.controllers.usuari.UsuariRestController;
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
    private LoginRestController loginRestController;
    private UsuariRepositori usuariRepositori;

    public MessageRestController(MessageRepositori messageRepositori, LoginRestController loginRestController,
                                 UsuariRepositori usuariRepositori){
        this.messageRepositori = messageRepositori;
        this.loginRestController = loginRestController;
        this.usuariRepositori = usuariRepositori;
    }


    @GetMapping("/{codiConversa}")
    public List<Message> getMessagesByReceptorIdAndEmisorId(@PathVariable String codiConversa){
        return this.messageRepositori.findAllByCodiConversaOrderByMessageIdAsc(codiConversa);
    }

    @GetMapping("/usuaris")
    public List<Map<String, String>> getAllUsuaris(){
        List<Map<String, String>> infoReduidaUsuaris = new ArrayList<>();

        for (Usuari usuari : usuariRepositori.findAll()) {
            infoReduidaUsuaris.add(loginRestController.mapUsuari(usuari));
        }

        return infoReduidaUsuaris;
    }

    @PostMapping("")
    public Message postMessage(@RequestBody Message message){
        return messageRepositori.save(message);
    }

}
