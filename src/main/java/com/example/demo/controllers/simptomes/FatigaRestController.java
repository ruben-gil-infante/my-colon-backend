package com.example.demo.controllers.simptomes;

import com.example.demo.domain.registreSimptomes.Fatiga;
import com.example.demo.repositories.registreSimptomes.FatigaRepositori;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fatiga")
public class FatigaRestController {

    private FatigaRepositori fatigaRepositori;

    public FatigaRestController(FatigaRepositori fatigaRepositori){
        this.fatigaRepositori = fatigaRepositori;
    }

    @GetMapping("/{usuari}")
    public List<Fatiga> getFatigaByUsuari(@PathVariable Integer usuari){
        return this.fatigaRepositori.findAllByUsuariOrderByDataDesc(usuari);
    }

    @PostMapping()
    public void saveFatiga(@RequestBody Fatiga fatiga){
        this.fatigaRepositori.save(fatiga);
    }

}
