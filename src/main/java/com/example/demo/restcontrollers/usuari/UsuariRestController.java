package com.example.demo.restcontrollers.usuari;

import com.example.demo.domain.usuaris.Usuari;
import com.example.demo.repositories.UsuariRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/usuari")
public class UsuariRestController {

    @Autowired
    private UsuariRepositori usuariRepositori;

    @GetMapping("/{correuElectronic}/{password}")
    public Usuari getUsuariById(@PathVariable String correuElectronic, @PathVariable String password){
        Usuari usuari = usuariRepositori.findByCorreuElectronic(correuElectronic);
        if(usuari == null){
            throw new IllegalArgumentException("El correu introduït no existeix...", null);
        }else if(!usuari.getPassword().equals(password)){
            throw new IllegalArgumentException("Password inocrrecte...", null);
        }

        return usuari;
    }

    @PostMapping
    public void registrarUsuari(@RequestBody Usuari usuari){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        usuari.setPassword(bCryptPasswordEncoder.encode(usuari.getPassword()));

        usuariRepositori.save(usuari);
    }
}
