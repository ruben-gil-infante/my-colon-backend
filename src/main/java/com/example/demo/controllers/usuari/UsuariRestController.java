package com.example.demo.controllers.usuari;

import com.example.demo.domain.usuaris.Usuari;
import com.example.demo.repositories.UsuariRepositori;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/usuari")
public class UsuariRestController {

    private UsuariRepositori usuariRepositori;

    @Bean
    PasswordEncoder passwordEncoder() {return new BCryptPasswordEncoder(); }

    public UsuariRestController(UsuariRepositori usuariRepositori){
        this.usuariRepositori = usuariRepositori;
    }

    @GetMapping("/{correuElectronic}/{password}")
    public Usuari getUsuariById(@PathVariable String correuElectronic, @PathVariable String password){
        Usuari usuari = usuariRepositori.findByCorreuElectronic(correuElectronic);

        if(usuari == null){
            throw new IllegalArgumentException("El correu introduït no existeix...", null);
        }

        return usuari;
    }

    @PostMapping
    public void registrarUsuari(@RequestBody Usuari usuari){
        usuari.setPassword(this.passwordEncoder().encode(usuari.getPassword()));
        usuariRepositori.save(usuari);
    }


}
