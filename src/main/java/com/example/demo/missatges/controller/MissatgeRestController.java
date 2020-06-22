package com.example.demo.missatges.controller;

import com.example.demo.missatges.domain.Missatge;
import com.example.demo.missatges.repositories.MissatgeRepositori;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/missatges")
public class MissatgeRestController {

    private MissatgeRepositori missatgeRepositori;

    public MissatgeRestController(MissatgeRepositori missatgeRepositori){
        this.missatgeRepositori = missatgeRepositori;
    }


    @GetMapping("/{codiConversa}")
    public List<Missatge> getMessagesByReceptorIdAndEmisorId(@PathVariable String codiConversa){
        return this.missatgeRepositori.findAllByCodiConversaOrderByMessageIdAsc(codiConversa);
    }

    @PostMapping("")
    public Missatge postMessage(@RequestBody Missatge missatge){
        return missatgeRepositori.save(missatge);
    }

}
