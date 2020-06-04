package com.example.demo.controllers.security;

import com.example.demo.domain.usuaris.Usuari;
import com.example.demo.repositories.usuaris.UsuariRepositori;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/registrar")
public class RegistrarLoginController {

    private UsuariRepositori usuariRepositori;
    private PasswordEncoder passwordEncoder;

    public RegistrarLoginController(UsuariRepositori usuariRepositori, PasswordEncoder passwordEncoder){
        this.usuariRepositori = usuariRepositori;
        this.passwordEncoder = passwordEncoder;
    }


    // FIXME: Mostrar errors correctament quan l'usuari no es pot registrar
    @PostMapping()
    public Usuari prova(@RequestBody Usuari usuari){
        if(usuariRepositori.findByCorreuElectronic(usuari.getCorreuElectronic()) != null)
            throw new IllegalArgumentException("Usuari prèviament registrat");

        usuari.setPassword(passwordEncoder.encode(usuari.getPassword()));
        return usuariRepositori.save(usuari);
    }
}
