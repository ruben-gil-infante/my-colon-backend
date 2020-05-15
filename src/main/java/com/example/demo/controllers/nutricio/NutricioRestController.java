package com.example.demo.controllers.nutricio;

import com.example.demo.domain.nutricio.Nutricio;
import com.example.demo.repositories.NutricioRepositori;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/nutricio")
public class NutricioRestController {

    private NutricioRepositori nutricioRepositori;

    public NutricioRestController (NutricioRepositori nutricioRepositori){
        this.nutricioRepositori = nutricioRepositori;
    }

    @GetMapping("/{usuari}")
    public List<Nutricio> getNutricioByUsuari(@PathVariable Integer usuari){
        return this.nutricioRepositori.findAllByUsuari(usuari);
    }

    @PostMapping()
    public void saveNutricio(@RequestBody Nutricio nutricio){
        this.nutricioRepositori.save(nutricio);
    }
}
