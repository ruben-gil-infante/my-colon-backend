package com.example.demo.controllers.security;

import com.example.demo.domain.usuaris.Usuari;
import com.example.demo.repositories.usuaris.UsuariRepositori;
import com.example.demo.utils.Utils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/login")
public class LoginRestController {

    private UsuariRepositori usuariRepositori;
    private Utils utils;

    public LoginRestController(UsuariRepositori usuariRepositori){
        this.usuariRepositori = usuariRepositori;
        this.utils = new Utils();
    }

    @GetMapping
    public Map<String, String> login(Principal principal){
        Usuari usuari = this.usuariRepositori.findByCorreuElectronic(principal.getName());
        return this.utils.mapUsuari(usuari);
    }



}
