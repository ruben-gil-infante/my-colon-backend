package com.example.demo.controllers.usuari;

import com.example.demo.domain.usuaris.Usuari;
import com.example.demo.repositories.usuaris.UsuariRepositori;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auxiliar")
public class AuxiliarController {

    private UsuariRepositori usuariRepositori;

    public AuxiliarController(UsuariRepositori usuariRepositori){
        this.usuariRepositori = usuariRepositori;
    }

    @GetMapping
    public List<Usuari> getAllUsers(){
        return this.usuariRepositori.findAll();
    }

}
