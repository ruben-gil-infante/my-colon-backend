package com.example.demo.controllers.message;

import com.example.demo.controllers.security.LoginRestController;
import com.example.demo.domain.usuaris.Usuari;
import com.example.demo.domain.message.Message;
import com.example.demo.repositories.message.MessageRepositori;
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

    @GetMapping("/contactes")
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
