package com.example.demo.controllers.comunitat;

import com.example.demo.domain.comunitat.Esdeveniment;
import com.example.demo.repositories.comunitat.EsdevenimentRepositori;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/esdeveniments")
public class EsdevenimentRestController {

    private EsdevenimentRepositori esdevenimentRepositori;

    public EsdevenimentRestController (EsdevenimentRepositori esdevenimentRepositori){
        this.esdevenimentRepositori = esdevenimentRepositori;
    }

    @GetMapping()
    public List<Esdeveniment> getAllEsdeveniments(){
        return this.esdevenimentRepositori.findAll();
    }

    @PostMapping()
    public Esdeveniment registrarEsdeveniment(@RequestBody Esdeveniment esdeveniment){
        return this.esdevenimentRepositori.save(esdeveniment);
    }
}
