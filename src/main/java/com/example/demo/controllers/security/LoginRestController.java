package com.example.demo.controllers.security;

import com.example.demo.domain.usuaris.Usuari;
import com.example.demo.repositories.UsuariRepositori;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/login")
public class LoginRestController {

    private UsuariRepositori usuariRepositori;

    public LoginRestController(UsuariRepositori usuariRepositori){
        this.usuariRepositori = usuariRepositori;
    }

    @GetMapping
    public Map<String, String> login(Principal principal){
        Usuari usuari = this.usuariRepositori.findByCorreuElectronic(principal.getName());
        Map<String, String> infoUsuari = new HashMap<>();
        infoUsuari.put("nom", usuari.getNom());
        infoUsuari.put("primerCognom", usuari.getPrimerCognom());
        infoUsuari.put("segonCognom", usuari.getSegonCognom());
        infoUsuari.put("correuElectronic", usuari.getCorreuElectronic());
        infoUsuari.put("id", String.valueOf(usuari.getId()));

        return infoUsuari;
    }

}
