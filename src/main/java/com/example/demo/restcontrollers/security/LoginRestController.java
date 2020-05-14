package com.example.demo.restcontrollers.security;

import com.example.demo.domain.usuaris.Usuari;
import com.example.demo.repositories.UsuariRepositori;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/v1/login")
public class LoginRestController {

    private UsuariRepositori usuariRepositori;

    public LoginRestController(UsuariRepositori usuariRepositori){
        this.usuariRepositori = usuariRepositori;
    }

    @GetMapping
    public Usuari login(Principal principal){
        return this.usuariRepositori.findByCorreuElectronic(principal.getName());
    }

}
