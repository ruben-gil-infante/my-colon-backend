package com.example.demo.controllers.nota;

import com.example.demo.domain.nota.Nota;
import com.example.demo.repositories.nota.NotaRepositori;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notes")
public class NotaRestController {

    @Autowired
    private NotaRepositori notaRepositori;

    @GetMapping("/{usuari}")
    public List<Nota> getNotasByUsuari(@PathVariable Integer usuari){
        return this.notaRepositori.findAllByUsuari(usuari);
    }

    @PostMapping("/")
    public Nota guardarNota(@RequestBody Nota nota){
        return this.notaRepositori.save(nota);
    }

    @DeleteMapping("/{id}")
    public void eliminarNota(@PathVariable Integer id){
        this.notaRepositori.deleteById(id);
    }

}
