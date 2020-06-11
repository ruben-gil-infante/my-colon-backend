package com.example.demo.controllers.usuari;

import com.example.demo.domain.signesvitals.SignesVitals;
import com.example.demo.domain.usuaris.Usuari;
import com.example.demo.repositories.signesVitals.SignesVitalsRepositori;
import com.example.demo.repositories.usuaris.UsuariRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/v1/usuari")
public class UsuariRestController {

    private UsuariRepositori usuariRepositori;

    @Autowired
    private SignesVitalsRepositori signesVitalsRepositori;

    @Bean
    PasswordEncoder passwordEncoder() {return new BCryptPasswordEncoder(); }

    public UsuariRestController(UsuariRepositori usuariRepositori){
        this.usuariRepositori = usuariRepositori;
    }


    @GetMapping("/{correuElectronic}")
    public Usuari getUsuariById(@PathVariable String correuElectronic){
        usuariRepositori.findAll();
        Usuari usuari = usuariRepositori.findByCorreuElectronic(correuElectronic);

        if(usuari == null){
            throw new IllegalArgumentException("El correu introduït no existeix...", null);
        }

        return usuari;
    }

    @PostMapping
    public void registrarUsuari(@RequestBody Usuari usuari) {
        usuari.setPassword(this.passwordEncoder().encode(usuari.getPassword()));
        usuariRepositori.save(usuari);
    }


}
