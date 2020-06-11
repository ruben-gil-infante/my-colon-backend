package com.example.demo.controllers.usuari;

import com.example.demo.controllers.security.LoginRestController;
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
    private LoginRestController loginRestController;

    @Bean
    PasswordEncoder passwordEncoder() {return new BCryptPasswordEncoder(); }

    public UsuariRestController(UsuariRepositori usuariRepositori, LoginRestController loginRestController){
        this.usuariRepositori = usuariRepositori;
        this.loginRestController = loginRestController;
    }

    @GetMapping("")
    public List<Map<String, String>> getAllUsuaris(){
        List<Map<String, String>> infoReduidaUsuaris = new ArrayList<>();

        for (Usuari usuari : usuariRepositori.findAll()) {
            infoReduidaUsuaris.add(loginRestController.mapUsuari(usuari));
        }

        return infoReduidaUsuaris;
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
