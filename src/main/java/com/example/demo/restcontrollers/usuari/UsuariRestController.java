package com.example.demo.restcontrollers.usuari;

import com.example.demo.domain.usuaris.Usuari;
import com.example.demo.repositories.UsuariRepositori;
import com.example.demo.utils.Utils;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/usuari")
public class UsuariRestController {

    private UsuariRepositori usuariRepositori;
    private Utils utils;


    public UsuariRestController(UsuariRepositori usuariRepositori, Utils utils){
        this.usuariRepositori = usuariRepositori;
        this.utils = utils;
    }

    @GetMapping("/{correuElectronic}/{password}")
    public Usuari getUsuariById(@PathVariable String correuElectronic, @PathVariable String password){
        Usuari usuari = usuariRepositori.findByCorreuElectronic(correuElectronic);

        if(usuari == null){
            throw new IllegalArgumentException("El correu introduït no existeix...", null);
        }

        password = this.utils.MD5Encriptation(password);

        if(!usuari.getPassword().equals(password)){
            throw new IllegalArgumentException("Password inocrrecte...", null);
        }

        return usuari;
    }

    @PostMapping
    public void registrarUsuari(@RequestBody Usuari usuari){
        usuari.setPassword(this.utils.MD5Encriptation(usuari.getPassword()));
        usuariRepositori.save(usuari);
    }


}
