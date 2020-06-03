package com.example.demo.controllers.simptomes;

import com.example.demo.domain.registreSimptomes.Diarrees;
import com.example.demo.repositories.DiarreesRepositori;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/diarrees")
public class DiarreesRestController {

    private DiarreesRepositori diarreesRepositori;

    public DiarreesRestController (DiarreesRepositori diarreesRepositori){
        this.diarreesRepositori = diarreesRepositori;
    }

    @GetMapping("/{usuari}")
    public List<Diarrees> getDiarreesByUsuari(@PathVariable Integer usuari){
        return this.diarreesRepositori.findAllByUsuari(usuari);
    }

    @PostMapping()
    public void saveDiarrees(@RequestBody Diarrees diarrees){
        this.diarreesRepositori.save(diarrees);
    }

}
