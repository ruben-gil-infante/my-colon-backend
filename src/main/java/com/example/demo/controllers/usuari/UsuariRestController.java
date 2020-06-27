package com.example.demo.controllers.usuari;

import com.example.demo.controllers.security.LoginRestController;
import com.example.demo.domain.signesvitals.SignesVitals;
import com.example.demo.domain.usuaris.Usuari;
import com.example.demo.repositories.signesVitals.SignesVitalsRepositori;
import com.example.demo.repositories.usuaris.UsuariRepositori;
import com.example.demo.utils.Utils;
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
@RequestMapping("/api/v1/usuaris")
public class UsuariRestController {

    private UsuariRepositori usuariRepositori;
    private LoginRestController loginRestController;
    private Utils utils;

    @Bean
    PasswordEncoder passwordEncoder() {return new BCryptPasswordEncoder(); }

    public UsuariRestController(UsuariRepositori usuariRepositori, LoginRestController loginRestController){
        this.usuariRepositori = usuariRepositori;
        this.loginRestController = loginRestController;
        this.utils = new Utils();
    }

    @GetMapping("")
    public List<Map<String, String>> getAllUsuaris(){
        List<Map<String, String>> infoReduidaUsuaris = new ArrayList<>();

        for (Usuari usuari : usuariRepositori.findAllBySanitari(false)) {
            infoReduidaUsuaris.add(utils.mapUsuari(usuari));
        }

        return infoReduidaUsuaris;
    }

    @GetMapping("/sanitari")
    public List<Map<String, String>> getAllSanitaris(){
        List<Map<String, String>> infoReduidaSanitaris = new ArrayList<>();

        for(Usuari usuari : usuariRepositori.findAllBySanitari(true)){
            infoReduidaSanitaris.add(utils.mapUsuari(usuari));
        }

        return infoReduidaSanitaris;
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

    @DeleteMapping("/{correuElectronic}")
    public Usuari elminarUsuari(@PathVariable String correuElectronic){
        Usuari usuariAEliminar = usuariRepositori.findByCorreuElectronic(correuElectronic);

        if(usuariAEliminar != null)
            usuariRepositori.delete(usuariAEliminar);

        return usuariAEliminar;
    }

}
