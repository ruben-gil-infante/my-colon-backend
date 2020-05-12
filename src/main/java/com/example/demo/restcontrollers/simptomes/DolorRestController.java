package com.example.demo.restcontrollers.simptomes;

import com.example.demo.domain.registre_simptomes.Dolor;
import com.example.demo.repositories.DolorRepositori;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dolor")
public class DolorRestController {

    private DolorRepositori dolorRepositori;

    public DolorRestController(DolorRepositori dolorRepositori){
        this.dolorRepositori = dolorRepositori;
    }

    @GetMapping("/{usuari}")
    public List<Dolor> getDolorByUsuari(@PathVariable Integer usuari){
        return this.dolorRepositori.findAllByUsuari(usuari);
    }

    @PostMapping()
    public void guardarDolor(@RequestBody Dolor dolor){
        this.dolorRepositori.save(dolor);
    }

}
